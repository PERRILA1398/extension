package org.example;

import org.openqa.selenium.By;;

import java.sql.Timestamp;



public class Utils extends BasePage {


    public static  void ClickOnElement(By by)
    {
     driver.findElement(by).click();
    }

    public static void  TypeText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public static String Gettext (By by)
    {
        return driver.findElement(by).getText();



    }
    public  long timestamp  ()
    {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
}
