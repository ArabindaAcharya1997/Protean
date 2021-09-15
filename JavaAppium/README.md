# java-appium-automation

This repository demonstrates how to run Appium Java tests on Protean App Automate.

## Setup

### Requirements

1. Java 8+

- If Java is not installed, follow these instructions:
    - For Windows, download latest java version from [here](https://java.com/en/download/) and run the installer executable
    - For Mac and Linux, run `java -version` to see what java version is pre-installed. If you want a different version download from [here](https://java.com/en/download/)

2. Maven

    - If Maven is not downloaded, download it from [here](https://maven.apache.org/download.cgi)
    - For installation, follow the instructions [here](https://maven.apache.org/install.html)

### Install the dependencies

To install the dependencies, run the following command in the project's base folder

```cmd
mvn clean install
```

## Getting Started

Getting Started with Appium tests in Java on Protean is that simple!

### Run your first test :

**1. Upload your Android or iOS App**

Upload and install your Android app (.apk or .aab file) or iOS app (.ipa file) to Protean servers from upload app section.

**2. Configure and run your first test**

Open `AppiumTest.java` file in the `android` directory :

- Replace `YOUR_USERNAME` & `YOUR_ACCESS_KEY` with your Protean access credentials.

- Replace `Custom_AppPackage` & `Custom_AppActivity` with the correct app details.

- Set the device and OS version

- If you have uploaded your own app update the test case

- Run the test

- You can access the test execution results on [Automation --> Automation_Logs tab]

---