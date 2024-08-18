
-`docker pull quay.io/apicurio/apicurio-studio-ui:1.0.0.Beta1`

### Run Apicurio Studio


Run Apiurio Studio UI
`docker run -it -p 8888:8080 quay.io/apicurio/apicurio-studio-ui:1.0.0.Beta1`

Start working on the API. 
The work in progress file for the API is saved in the `resources/apis` folder.
Would be interesting if we could provide this file as an Internet URL.

Alternatively you can write your API definition in a file.  


## Create a Gradle Project


https://start.spring.io/

### Add and Configure the OpenApi Generator Plugin
Add the following dependencies in the `plugins` section of the `build.gradle` file.:

`id("org.openapi.generator") version "7.7.0"`

Research the usage of openapi-generator in the project. https://openapi-generator.tech/docs/plugins

- boils down to defining `tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("biddingOpenApiGenerate")`  
and setting the `inputSpec` and `generatorName` properties along with other props.
-  was not able to move this code to a different file though.
- create a task to delete the generated code before generating it again.
- link the deletion task to the clean task. 
 

## Make `/gen` a source folder

```code
sourceSets {
    val main by getting {
        java {
            srcDir("src/main/gen")
        }
    }
}
```

- Now Make the project compile by adding the following dependencies:
- - implementation("org.openapitools:jackson-databind-nullable:0.2.6")
- - implementation ("jakarta.validation:jakarta.validation-api:3.0.2")
- - implementation("io.swagger.core.v3:swagger-annotations:2.2.21")
