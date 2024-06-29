package br.com.ti.roberto.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver createDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }
}