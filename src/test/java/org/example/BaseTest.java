package org.example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils

{
    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setup()
    {
        driverManager.Openbrowser();
    }

    @AfterMethod
    public void teardown ()
    {
        driverManager.CloseBrowser();
    }
}
