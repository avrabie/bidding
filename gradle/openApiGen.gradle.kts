

//Generate a new task that prints Hello World
tasks.register("hello") {
    doLast {
        println("Hello World")
    }
}


tasks.register("deleteGeneratedSources") {
    doFirst {
        delete("$rootDir/src/main/gen")
    }
}

tasks.named("clean") {
    dependsOn("deleteGeneratedSources")
}

tasks.named("compileJava") {
    dependsOn("openApiGenerate")
    dependsOn("copyMyGeneratedSources")

}


tasks.register("copyMyGeneratedSources") {
    dependsOn("openApiGenerate")
    doLast {
        // Optionally, copy the generated files to the main source set
        copy {
            from("$buildDir/generated/src/main/java")
            into("src/main/gen")
        }
    }
}
//tasks.named("processResources") {
//    dependsOn("biddingOpenApiGenerate")
//}

