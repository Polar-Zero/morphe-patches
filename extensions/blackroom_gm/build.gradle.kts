extension {
    name = "extensions/extension.mpe"
}

android {
    namespace = "app.template.extension"
}

configure<LibraryExtension> {
    namespace = "app.morphe.extension.shared"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.morphe.extensions.library)
    compileOnly(libs.annotation)
}