# Android Project Starter

**Android Project Starter** is a pre-configured Android project template that saves time by setting up essential dependencies, tools, and best practices from the start.

---

## Features & Pre-installed Dependencies
This project comes with the following **essential dependencies**:

### **🔹 Core Dependencies**
- `androidx.core:core-ktx` → Kotlin extensions for Android
- `androidx.appcompat:appcompat` → Support for older Android versions
- `com.google.android.material:material` → Material Design UI components
- `androidx.constraintlayout:constraintlayout` → Advanced layout system
- `androidx.activity:activity-ktx` → Simplifies activity management

### ** UI Enhancements & Styling**
- **ViewBinding** → Type-safe access to XML views without `findViewById()`
- **Glide** → Efficient image loading from URLs
- **Navigation Component** → Simplifies fragment transitions
- **Lottie Animations** (optional) → Support for animated vector graphics

### ** Performance & Utilities**
- **KSP (Kotlin Symbol Processing)** → Faster annotation processing
- **Retrofit** (optional) → REST API calls made easy
- **Room Database** (optional) → Local storage with SQLite

---

## Getting Started
Follow these steps to set up and use this starter template:

### **1️⃣ Clone the Repository**
```sh
 git clone https://github.com/reuben200/android-starter.git
 cd android-starter
```

### **2️⃣ Open in Android Studio**
- Launch **Android Studio**
- Select **Open an existing project**
- Navigate to the cloned folder and open it

### **3️⃣ Sync Gradle**
Ensure all dependencies are downloaded:
```sh
 File > Sync Project with Gradle Files
```

### **4️⃣ Run the Project**
- Connect a device (or start an emulator)
- Click ▶️ **Run** in Android Studio

---

## 📂 Project Structure
```
📁 Android-Project-Starter
 ├── 📁 app
 │   ├── 📂 src/main/java/com/example/starter
 │   │   ├── 📄 MainActivity.kt
 │   │   ├── 📄 DetailActivity.kt
 │   ├── 📂 res/layout
 │   │   ├── 📄 activity_main.xml
 │   ├── 📄 AndroidManifest.xml
 ├── 📄 build.gradle.kts
 ├── 📄 settings.gradle.kts
 ├── 📄 .gitignore
 ├── 📄 README.md
```

---

## 🛠️ How to Add More Dependencies
To add new dependencies, open **`build.gradle.kts`** and insert the required libraries under `dependencies`.

For example, to add **Lottie animations**:
```kotlin
dependencies {
    implementation("com.airbnb.android:lottie:5.2.0")
}
```
Then **Sync Gradle** to apply changes.

---

##  Useful Commands
| **Command**                                                  | **Description**      |
|--------------------------------------------------------------|----------------------|
| `git clone https://github.com/reuben200/android-starter.git` | Clone the repository |
| `git pull origin main`                                       | Get latest updates   |
| `./gradlew build`                                            | Build the project    |
| `./gradlew clean`                                            | Clean project files  |
| `./gradlew assembleDebug`                                    | Build debug APK      |

---

## Contributing
Feel free to **fork this repository** and contribute with enhancements, bug fixes, or additional setup configurations.

---

## License
This project is licensed under the **MIT License**. You are free to use, modify, and distribute it.

💻 Happy Coding!

