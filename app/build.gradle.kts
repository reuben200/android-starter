plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp) //ksp plugin added to work with glide
}



android {
    namespace = "com.example.tourguide"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.tourguide"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        viewBinding {
            enable = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}


dependencies {
    // Core dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //ADDITIONAL DEPENDENCIES
     //  ViewModel & LiveData
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)

    //  Glide for Image Loading
    implementation(libs.glide)
    ksp(libs.glide.compiler)

    //  Navigation Component
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    //  RecyclerView
    implementation(libs.recyclerview)

    //  Retrofit & Moshi (API Handling)
    implementation(libs.retrofit)
    implementation(libs.moshi.converter)

    //  Coroutines (For Async Tasks)
    implementation(libs.coroutines.android)

    //  Room Database (Offline Data Storage)
    implementation(libs.room.runtime)
    ksp(libs.room.compiler)
    implementation(libs.room.ktx)

    //  Lottie (For High-Quality JSON Animations)
    implementation(libs.lottie)

    //  AndroidX Transitions (For Smooth Scene-Based Transitions)
    implementation(libs.androidx.transitions)

    //  Jetpack Compose Animations (If Using Compose)
    implementation(libs.compose.animation)
}

