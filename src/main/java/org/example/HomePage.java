package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class HomePage extends Utils {
    private By _Homeclassname = By.xpath("//a[@class='ico-register']");
    By _good = By.xpath("//input[@id='pollanswers-2']");
    By _vote =By.xpath("//button[@id='vote-poll-1']");
    By _errormessage =By.xpath("//div[@class='poll-vote-error']");

    By _apple=  By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    String expectedVotingMessage= "Only registered users can vote.";


    public void UserShouldBeAbleClickOnRegisterButton()
    {

        ClickOnElement(_Homeclassname);

    }

    public void UserShouldBeAbleToSeeAnErrorMessagewhileVoting ()

    {

        ClickOnElement(_good);
        ClickOnElement(_vote);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_errormessage));
        String actualmessage1 =Gettext(_errormessage);
        Assert.assertEquals(actualmessage1,expectedVotingMessage);

    }

    public void Usershouldbeabletoaddaproducttocart ()
    {
        ClickOnElement(_apple);
    }
}
