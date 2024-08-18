

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
    dependsOn("biddingOpenApiGenerate")
}

tasks.named("processResources") {
    dependsOn("biddingOpenApiGenerate")
}

