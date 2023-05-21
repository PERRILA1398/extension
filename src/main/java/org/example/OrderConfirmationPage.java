package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmationPage extends Utils
{
    By _ordernumber= By.cssSelector("div[class=order-number]");
    String expected = "ORDER NUMBER: 1050";

    public void usershouldbeabletoseeanorderconfirmationmessage ()
    {
       String actual=  Gettext(_ordernumber);
        System.out.println(actual);
    }
}
