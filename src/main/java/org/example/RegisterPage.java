package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils {
    LoadProp loadProp= new LoadProp();
    By _username = By.xpath("//input[@id='FirstName']");

    By _lastname = By.xpath("//input[@id='LastName']");
    By _email = By.xpath("//input[@type='email']");

    By _password= By.xpath("(//input[@type='password']) [1]");

    By _confirmpassword= By.xpath("(//input[@type='password']) [2]");

    By _submit = By.xpath("(//button[@type='submit']) [2]");

    By _month = By.xpath("//select[@name='DateOfBirthMonth']");

    By _Birth = By.xpath("//select[@name='DateOfBirthDay']");

    By _Day =By.xpath("//select[@name='DateOfBirthYear']");

    String username = loadProp.getProperty("username");
    String lastname= loadProp.getProperty("lastname");
    public  void UserShouldBeAbleToRegisterSuccessfully() {


        TypeText(_username, "username");
        TypeText(_lastname, "lastname");
        selectbyValue(_Birth, "3");
        selectBytext(_month, "February");
        selectbyindex(_Day, 10);
        TypeText(_email, "QQ" + timestamp() + "@gmail.com");
        TypeText(_password, "QQRAJESH");
        TypeText(_confirmpassword, "QQRAJESH");
        ClickOnElement(_submit);

    }


    }

