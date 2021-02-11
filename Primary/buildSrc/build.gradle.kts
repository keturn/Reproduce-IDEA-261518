plugins {
    `kotlin-dsl`
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
}

dependencies {
    // This is also part of the root project's composite build, see Primary/settings.gradle.kts
    implementation("net.keturn.idea-261518:lib:+")
}
