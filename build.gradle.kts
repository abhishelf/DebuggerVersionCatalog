// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    `version-catalog`
    id("com.moengage.plugin.maven.publish").version("0.0.1")
}

catalog {
    versionCatalog {
        version("kotlinVersion", "1.9.23")

        library("kotlinStdLib","org.jetbrains.kotlin", "kotlin-stdlib").versionRef("kotlinVersion")
        library("annotation","androidx.annotation", "annotation").version("1.7.1")

        plugin("plugin-kotlin-android", "org.jetbrains.kotlin.android").versionRef("kotlinVersion")

        bundle("allLibrary", listOf("kotlinStdLib", "annotation"))
    }
}