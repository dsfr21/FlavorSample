plugins {
    // 使用 android app 插件
    alias(libs.plugins.android.application)
    // 使用 kotlin 的 android 專案
    alias(libs.plugins.kotlin.android)
    // 使用 jetpack compose 的專案
    alias(libs.plugins.kotlin.compose)
}
// AGP 提供的配置 api
android {
    namespace = "com.example.flavorsample"
    compileSdk = 35 // 編譯的sdk等級
    defaultConfig {
        // app 的唯一辨識id
        applicationId = "com.example.flavorsample"
        // 最低與最高支援的 sdk 等級
        minSdk = 26
        targetSdk = 35
        // 版本號與版本名稱
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    // flavor settings
    // 增加一個 Dimension
    val tier = "tier"
    flavorDimensions += tier
    productFlavors {
        val isPaidNameType = "Boolean"
        val isPaidNameVarName = "IS_MEMBER"
        // Create a flavor called "free"
        create("free") {
            // This flavor is belong to dimension "tier"
            dimension = tier
            buildConfigField(isPaidNameType, isPaidNameVarName, "false")
        }
        // Create a flavor called "normal"
        create("normal") {
            dimension = tier
            buildConfigField(isPaidNameType, isPaidNameVarName, "true")
        }
        // Create a flavor called "premium"
        create("premium") {
            dimension = tier
            buildConfigField(isPaidNameType, isPaidNameVarName, "true")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}
// 聲明此專案引用的依賴
dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Specific flavor only dependencies
    val normalImplementation by configurations
    val premiumImplementation by configurations
    // https://mvnrepository.com/artifact/com.github.javafaker/javafaker
    // 只有 flavor 是 normal 時引用的依賴
    //noinspection UseTomlInstead
    normalImplementation("com.github.javafaker:javafaker:1.0.2")
    // 只有 flavor 是 premium 時引用的依賴
    //noinspection UseTomlInstead
    premiumImplementation("com.github.javafaker:javafaker:1.0.2")
}