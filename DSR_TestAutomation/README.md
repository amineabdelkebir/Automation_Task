# Automation_Task
This project is a Maven-based Java project that requires Java 11 or later.

## Prerequisites

- [Java 11 or later](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Setting Up Java and Maven depend to your OS flow the right steps:

1. Download and install Java: Follow the instructions provided by [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) to download and install Java.

2. Download and install Maven: Follow the instructions provided on the [Maven download page](https://maven.apache.org/download.cgi) to download and install Maven.

3. Set Java and Maven Environment Variables:
   - Set the `JAVA_HOME` environment variable to the path where Java is installed.
   - Add the Maven `bin` directory to the `PATH` environment variable.

## Generating Allure Reports

After running the tests, Allure reports will be generated.

### Installing Allure

To view the test reports, you need to install Allure.

- For Ubuntu
  1  sudo apt-add-repository -y ppa:qameta/allure
  2  sudo apt-get update
  3  sudo apt-get install allure
  4  allure --version

  - For deffirent OS
Follow the instructions on the [Allure Framework Installation page](https://docs.qameta.io/allure/#_installing_a_commandline) to install Allure on your machine.

## Running the Project

To run the project and generate Allure reports, follow these steps:

1. Open a terminal or command prompt.

2. Navigate to the project directory:

    ```bash
    cd path/to/your/Automation_Task
    ```

3. Run the following command:

    ```bash
    bash execute_report.sh    ```

This command will execute the necessary scripts to run the tests and generate Allure reports.

**Note:** Ensure that the `execute_report.sh` script has the appropriate permissions to be executed.

## Additional Notes

- Make sure you have a stable internet connection during the first run, as Maven will download project dependencies.

- Customize the project if needed, and refer to the Maven documentation for more advanced configurations.

Happy testing!
