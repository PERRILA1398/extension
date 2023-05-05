package org.example;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationMessage extends Utils {

    By _result = By.xpath("//div[@class='result']");
    static String expectedRegistrationMessage = "Thanks for registration";


    public void UserShouldBeAbleToSeeRegistrationMessage() {

        String actualmessage = Gettext(_result);
        Assert.assertEquals(actualmessage, expectedRegistrationMessage, "Registration Message Do not Match");
    }
}
