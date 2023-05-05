package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils {
    By _username = By.xpath("//input[@id='FirstName']");

    By _lastname = By.xpath("//input[@id='LastName']");
    By _email = By.xpath("//input[@type='email']");

    By _password= By.xpath("(//input[@type='password']) [1]");

    By _confirmpassword= By.xpath("(//input[@type='password']) [2]");

    By _submit = By.xpath("(//button[@type='submit']) [2]");
    public  void UserShouldBeAbleToRegisterSuccessfully() {


        TypeText(_username, "QQ");
        TypeText(_lastname, "QQ");
        TypeText(_email, "QQ" + timestamp() + "@gmail.com");
        TypeText(_password, "QQRAJESH");
        TypeText(_confirmpassword, "QQRAJESH");
        ClickOnElement(_submit);

    }
}
