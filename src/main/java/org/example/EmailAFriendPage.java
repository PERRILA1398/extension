package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class  EmailAFriendPage extends Utils

{
    By _emailid = By.xpath("//input[@class='friend-email']");
    By _Friendemail = By.xpath("//input[@class='your-email']");

    By _YourMessage = By.xpath("//textarea[@class='your-email']");

    By _SendEmail = By.xpath("//button[@name='send-email']");

    By _ShownMessage = By.xpath("//div[@class='message-error validation-summary-errors']/ul/li");

    String expectedEmailAFriendMessage = "Only Registered Users can send an email";
   public void UserShouldBeAbleToTypeInDetailsToEmailAFriend()
   {
       TypeText(_emailid,"Test"+ timestamp()+ "@gmail.com" );
       TypeText(_Friendemail,"testerfriend" + timestamp() + "@gmail.com");
       TypeText(_YourMessage, "This laptop is so pricey");
       ClickOnElement(_SendEmail);
       String actualmessage2= Gettext(_ShownMessage);
       Assert.assertEquals(actualmessage2,expectedEmailAFriendMessage, "Message is Correct" );

   }
}
