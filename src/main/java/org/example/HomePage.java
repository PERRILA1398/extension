package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;


public class HomePage extends Utils {
    private By _Homeclassname = By.xpath("//a[@class='ico-register']");
    By _good = By.xpath("//input[@id='pollanswers-2']");
    By _vote =By.xpath("//button[@id='vote-poll-1']");
    By _errormessage =By.xpath("//div[@class='poll-vote-error']");

    By _apple=  By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");


    String expectedVotingMessage= "Only registered users can vote.";



    By _click = By.xpath("//button[@class='button-1 search-box-button']");

    By _currency = By.cssSelector("select[name='customerCurrency']");

   By _searchbutton = By.cssSelector("input[id='small-searchterms']");

   By _searchclick= By.cssSelector("button[class='button-1 search-box-button']");

   By _newrelease= By.xpath("(//a[@class='read-more'] )[2]");

   By _yourowncomputer= By.xpath("(//a[@href='/build-your-own-computer']) [2]");

   By _facebookclick = By.cssSelector("li[class=facebook]");


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


    public void ToPrintproducttitles (){
        List< WebElement> productlist = driver.findElements(By.cssSelector("div.product-grid h2"));

        for (WebElement e: productlist) {
            System.out.println(e.getText());
        }
    }

    public void clickonsearchbutton () {

        ClickOnElement(_click);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please enter some keyword");
        alert.accept();

    }
    public void UseShouldBeAbleToSelectCurrencySelecter() {
        selectBytext(_currency, "Euro");

        List<WebElement> product = driver.findElements(By.cssSelector("div[class='product-grid home-page-product-grid']"));
        for (WebElement e : product) {
            System.out.println(e.getText());

        }
    }

        public void UserShouldBeAbleToSearchNikeItems ()
    {
        TypeText(_searchbutton, "Nike");
        ClickOnElement(_searchclick);



    }
    public void Usershouldbeabletoclickonnewrelease (){
        ClickOnElement(_newrelease);
    }

    public void UsershouldbeabletoclickonBuildyourowncomputer ()

    {
        ClickOnElement(_yourowncomputer);
    }public void UsershouldbeabletogoonFacebookpage ()
    {
        ClickOnElement(_facebookclick);
    }

    }


