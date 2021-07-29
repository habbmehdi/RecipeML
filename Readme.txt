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