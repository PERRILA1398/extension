package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class BuildYourOwnComputerPage extends Utils
{

    By _computertype=  By.cssSelector("select[id=product_attribute_1");

    By _ram = By.cssSelector("select[id=product_attribute_2]");

    By _hdd = By.cssSelector("input[id=product_attribute_3_6]");

    By _os = By.cssSelector("input[id=product_attribute_4_9]");

    By _softwareoption1 = By.xpath("//input[@name='product_attribute_5']");

    By _Softwareoption2 = By.cssSelector("input[id=product_attribute_5_11]");

    By _Softwareoption3= By.cssSelector("input[id=product_attribute_5_12]");
    By _addtocart= By.cssSelector("button[id=add-to-cart-button-1]");
   By _gotoshoppingcart = By.xpath("(//a[@href='/cart']) [1]");



    public void TypeinBuildyourComputerdetails ()
    {
     selectBytext(_computertype, "2.2 GHz Intel Pentium Dual-Core E2200");
     selectbyValue(_ram,"5");
     ClickOnElement(_hdd);
     ClickOnElement(_os);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement checkboxelement = driver.findElement(By.xpath("//input[@name='product_attribute_5']"));
     checkboxelement.click();

      //Actions actions= new Actions(driver);
      // actions.moveToElement(driver.findElement(By.xpath("//input[@name='product_attribute_5']"))).click().build().perform();

       WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(_softwareoption1));
       ClickOnElement(_Softwareoption2);
     ClickOnElement(_Softwareoption3);
     ClickOnElement(_addtocart);
     ClickOnElement(_gotoshoppingcart);




    }
}
