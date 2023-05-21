package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends  Utils
{
    By _finalproduct = By.xpath("(//div[@class='attributes']) [2]");

    By _click = By.cssSelector("input[id=termsofservice]");
    By _checkout = By.cssSelector("button[id=checkout]");

    By _guestcheckout = By.xpath("(//button[@type='button']) [2]");

    public void Useshouldbeonshoppingcartpage ()
        {
            String actualdetails= Gettext(_finalproduct);
            System.out.println(actualdetails);
           Assert.assertEquals(actualdetails, "Processor: 2.2 GHz Intel Pentium Dual-Core E2200" +
                  "RAM: 8GB [+$60.00]" +
                  "HDD: 320 GB" +
                    "OS: Vista Premium [+$60.00]" +
                    "Software: Microsoft Office [+$50.00]" +
                   "Software: Acrobat Reader [+$10.00]" +
                   "Software: Total Commander [+$5.00]");



        }

        public void UsershouldbeabletocheckoutasaGuestUser ()
        {
            ClickOnElement(_click);
            ClickOnElement(_checkout);
            ClickOnElement(_guestcheckout);

        }
}

