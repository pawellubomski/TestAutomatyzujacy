package com.sda.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverManager {
    public static WebDriver DRIVER;

    public static void startDriver() {
        switch (getDriverName().toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                DRIVER = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                DRIVER = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("Unsupported browser!!!");
        }
    }
    public static void destroyDriver(){
        DRIVER.quit();
    }
    private static String getDriverName(){
        return System.getProperty("browserName", "chrome");
    }
}
