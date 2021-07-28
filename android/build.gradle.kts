plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}

repositories {
  google()
  mavenCentral()
}

android {
  compileSdkVersion(30)
  defaultConfig {
    minSdkVersion(15)
    targetSdkVersion(30)
  }
}

dependencies {
  api(project(":mpp"))
}