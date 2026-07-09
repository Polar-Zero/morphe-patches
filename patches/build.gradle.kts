group = "app.template"

patches {
    // TODO: Update this section with your project details.
    about {
        name = "PolarZero Morphe Patches"
        description = "for game patching"
        source = "git@github.com:Polar-Zero/morphe-patches.git"
        author = "PolarZero"
        contact = "https://polarzero.net/"
        website = "https://polarzero.net/"
        license = "GPLv3"
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}