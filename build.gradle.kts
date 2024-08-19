plugins {
    java
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
    id("org.openapi.generator") version "7.7.0"
}
apply(from = "gradle/openApiGen.gradle.kts")

group = "xyz.optimized"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}



configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // OpenApiGenerator Start
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.21")


    // OpenApiGenerator End
}

tasks.withType<Test> {
    useJUnitPlatform()
}


openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$rootDir/src/main/resources/apis/bidding.yaml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("xyz.optimized.bidding02.api")
    invokerPackage.set("xyz.optimized.bidding02.invoker")
    modelPackage.set("xyz.optimized.bidding02.model")
    configOptions.put("interfaceOnly", "true")
    configOptions.put("delegatePattern", "true")
    configOptions.put("useTags", "true")
    configOptions.put("dateLibrary", "java8")
    configOptions.put("useSpringBoot3", "true")
    configOptions.put("useOptional", "true")
    configOptions.put("reactive", "true")
    configOptions.put("useBeanValidation", "false")
    configOptions.put("validateSpec", "false")
    configOptions.put("skipValidateSpec", "true")

    configOptions.put("useBeanValidation", "false")
    configOptions.put("useSwaggerFeature", "false")
    configOptions.put("useSwaggerAnnotations", "false")


}


tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("biddingOpenApiGenerate") {
    group = "openApi"
    description = "Generate OpenApi code"
    generatorName.set("spring")
    inputSpec.set("$rootDir/src/main/resources/apis/bidding.yaml")
    outputDir.set("$rootDir/src/main/gen")
    apiPackage.set("xyz.optimized.api")
    modelPackage.set("xyz.optimized.model")
    invokerPackage.set("xyz.optimized.invoker")
    configOptions.put("interfaceOnly", "true")
    configOptions.put("delegatePattern", "true")
    configOptions.put("useTags", "true")
    configOptions.put("dateLibrary", "java8")
    configOptions.put("useSpringBoot3", "true")
    configOptions.put("useOptional", "true")
    configOptions.put("reactive", "true")
    configOptions.put("useBeanValidation", "false")
    configOptions.put("validateSpec", "false")
    configOptions.put("skipValidateSpec", "true")

    configOptions.put("useBeanValidation", "false")
    configOptions.put("useSwaggerFeature", "false")
    configOptions.put("useSwaggerAnnotations", "false")
//    configOptions.put("sourceFolder", "src/main/gen")

}





sourceSets {
    // Configure the main source set
    val main by getting {
        java {
            // Add a custom folder to the source directories
            srcDir("src/main/gen")
        }
    }
}





