package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPage extends Utils
{
    By _applepage = By.xpath("//button[@class='button-2 email-a-friend-button']");
    public void UsershouldbeabletoAddDetailsclickonemailafriendbutton ()
    {ClickOnElement(_applepage);}
}
