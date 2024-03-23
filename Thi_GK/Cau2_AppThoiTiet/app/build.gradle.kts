
plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "ntu63130270.cau2_appthoitiet"
    compileSdk = 34

    defaultConfig {
        applicationId = "ntu63130270.cau2_appthoitiet"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"


    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
            implementation (libs.appcompat)
            implementation (libs.material)
            implementation (libs.activity)
            implementation (libs.constraintlayout)
            implementation (libs.glide)
}