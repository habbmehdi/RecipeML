RecipeML is a modeling environment for creating correct recipes built using the eclipse
modeling framework. The metamodels are created in Ecore and the textual syntax is
generated from Ecore in Xtext. In order to ensure recipe correctness, I used the Epsilon
Validation Language to define a set of constraints on the Recipe metamodel. Finally, I
used ATL to define the transformations of RecipeML
30 When a modeler wishes to model a recipe, he can do so in the RecipeML modeling
environment through the eclipse framework where the model will be validated to ensure
it accurately represents a correct recipe with the appropriate amounts. Users can then
define a list of ingredients that they would own using the pantry modeling framework.
When these files are created, their corresponding xmi models are generated, which are
35 then used as input for the transformation which outputs a xmi file that conforms to the
pantry metamodel that defines a list of ingredients amounts that need to be added to the
pantry to be able to use the recipe


In order to run and use RecipeML , similarly to the eclipse EMF tutorial : 

- Right-click the `RecipeML` project, Run as > Run configurations
- Create a new configuration under *Eclipse Application* called `Graphical`
- In the *Arguments* tab, under VM arguments paste: `-XX:PermSize=64M -XX:MaxPermSize=128M -Xms512M -Xmx1024M`
- Apply then Run
- Create a new Modeling project if 'RecipeModels' does not exist
- Right-click the project, select New > File, and create a file with the extension '.rmlt'
- Accept to convert the project into an Xtext project if prompted 

for the transformation : 

- open the RecipeMLTransf folder 
- add the automatically generated xmi files to the models folder
- right click RpeTransformation.atl -> run as - > run configurations
- change the source models and target models , MM = Recipe Model ,   MM1 : Pantry model , MM3 : Pantry model
