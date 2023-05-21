package org.example;

import org.openqa.selenium.By;

public class OrderFinalPage extends Utils
{
    By _finalcontinue = By.xpath("(//button[@type= 'button']) [13]");
    public void Usershouldbeonorderfinalpage ()
    {
        ClickOnElement(_finalcontinue);
    }
}
