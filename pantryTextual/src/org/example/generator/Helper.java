package org.example.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class Helper {
    public static void saveResourceAsXmi(Resource resource) {
        try {
            Map<String, String> saveOptions = new HashMap<String, String>();
            Resource xmlResource = new XMIResourceImpl(URI.createURI(resource.getURI().toString().replace("tryt", "xmi")));
            xmlResource.getContents().add(resource.getContents().get(0));
            saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,"UTF-8");
            xmlResource.save(saveOptions);
            System.out.println("XMI file created.");
        } catch (IOException e) {
            System.out.println("Error during the creation of XMI.");
        e.printStackTrace();
        }
    }
}