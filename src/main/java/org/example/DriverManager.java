package org.example;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    public LoadProp loadProp = new LoadProp();
    public String browsername = loadProp.getProperty("browsername");
    MutableCapabilities sauceOptions = new MutableCapabilities();
    public String USERNAME = loadProp.getProperty("SauceUsername");
    public String ACCESS_KEY = loadProp.getProperty("SauceAccesskey");
    public String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    public boolean SAUCE_LAB = true;


    @BeforeMethod

    public void Openbrowser() {

        if (SAUCE_LAB) {
            System.out.println("Running in SauceLabs" + browsername);


            if (browsername.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browsername.equalsIgnoreCase("Firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            } else if (browsername.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browsername.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browsername.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Sorry browser not found");
            }


            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }
    }


    @AfterMethod
    public void CloseBrowser() {
        driver.close();
    }
}




