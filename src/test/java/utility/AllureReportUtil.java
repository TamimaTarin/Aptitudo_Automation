package utility;

import java.io.IOException;

public class AllureReportUtil {

    public static void generateAllureReport() throws IOException, InterruptedException {
        ProcessBuilder generate = new ProcessBuilder("allure", "generate", "target/allure-results", "-o", "target/allure-report", "--clean");
        generate.inheritIO();
        Process processGenerate = generate.start();
        int exitCode = processGenerate.waitFor();
        if (exitCode == 0) {
            System.out.println("Allure report generated successfully!");
        } else {
            System.out.println("Failed to generate Allure report.");
        }
    }

    public static void openAllureReport() throws IOException, InterruptedException {
        ProcessBuilder open = new ProcessBuilder("allure", "open", "target/allure-report");
        open.inheritIO();
        Process processOpen = open.start();
        processOpen.waitFor();
    }
}