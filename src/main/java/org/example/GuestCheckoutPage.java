package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Timestamp;

public class GuestCheckoutPage extends Utils
{

    By _name= By.cssSelector("input[id=BillingNewAddress_FirstName]");
    By _lastname = By.cssSelector("input[id=BillingNewAddress_LastName]");

    By _email = By.cssSelector("input[id=BillingNewAddress_Email]");

    By _country = By.cssSelector("select[id=BillingNewAddress_CountryId]");

    By _province = By.cssSelector("select[id=BillingNewAddress_StateProvinceId]");

    By _city = By.cssSelector("input[id=BillingNewAddress_City]");

    By _address= By.cssSelector("input[id=BillingNewAddress_Address1]");

    By _postcode= By.cssSelector("input[id=BillingNewAddress_ZipPostalCode]");

    By _number = By.cssSelector("input[id=BillingNewAddress_PhoneNumber]");

    By _continue = By.xpath("(//button[@type='button']) [5]");





    public void Usershouldbeonguestcheckoutpage ()
    {
        TypeText(_name, "Maggie");
        TypeText(_lastname,"Noodles");
        TypeText(_email,"Maggie45678" + timestamp()  + "@gmail.com");
        selectBytext(_country, "India");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        TypeText(_city,"New Delhi");
        TypeText(_address, "North Campus");
        TypeText(_postcode, "734 764");
        TypeText(_number, "7492084515");
        ClickOnElement(_continue);







    }
}
