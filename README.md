Bidding ApiFirstDev Project
===========================
## Tech Stack
- Apicurio Studio
- Spring Boot 3.3.2
- - Spring WebFlux
- - Gradle
- - - OpenApi Generator
- Docker

 
## Apicurio Studio (Optional)
Getting Started with Apicurio Studio
https://www.apicur.io/studio/getting-started/

Prerequisites :
- Docker / Podman locally running (if you want to update the API definition)

-`docker pull quay.io/apicurio/apicurio-studio:1.0.0.Beta1`

-`docker pull quay.io/apicurio/apicurio-studio-ui:1.0.0.Beta1`

### Run Apicurio Studio

Run Apicurio Studio
`docker run -it -p 8080:8080 quay.io/apicurio/apicurio-studio:1.0.0.Beta1`

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
- make the `/gen` folder a source folder for the project.
