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

//    implementation("org.openapitools:openapi-generator:7.7.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
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
    configOptions.put("useBeanValidation", "true")

}

tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("biddingOpenApiGenerate2") {
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
    configOptions.put("useBeanValidation", "true")

}





