

//Generate a new task that prints Hello World
tasks.register("hello") {
    doLast {
        println("Hello World")
    }
}

//tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("biddingOpenApiGenerate2") {
//    group = "openApi"
//    description = "Generate OpenApi code"
//    generatorName.set("spring")
//    inputSpec.set("$rootDir/src/main/resources/apis/bidding.yaml")
//    outputDir.set("$rootDir/src/main/gen")
//    apiPackage.set("xyz.optimized.api")
//    modelPackage.set("xyz.optimized.model")
//    invokerPackage.set("xyz.optimized.invoker")
//    configOptions.put("interfaceOnly", "true")
//    configOptions.put("delegatePattern", "true")
//    configOptions.put("useTags", "true")
//    configOptions.put("dateLibrary", "java8")
//    configOptions.put("useSpringBoot3", "true")
//    configOptions.put("useOptional", "true")
//    configOptions.put("reactive", "true")
//    configOptions.put("useBeanValidation", "true")
//
//}


