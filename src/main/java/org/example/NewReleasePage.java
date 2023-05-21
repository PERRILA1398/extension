package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewReleasePage extends Utils
{
    By _title= By.cssSelector("input[class=enter-comment-title]");

    By _comment= By.cssSelector("textarea[class=enter-comment-text]");

    By _submitbutton = By.xpath("(//button[@type='submit']) [2]");
    public  void UsershouldbeonNewreleasepage ()
    {

        TypeText(_title, "Don'tAsk");
        TypeText(_comment, "I'm Trying ");
        ClickOnElement(_submitbutton);
        List<WebElement> commentlist= driver.findElements(By.cssSelector("div[class=comment-list]"));
        for (WebElement e: commentlist)
        {
            System.out.println(e.getText());
        }

    }
}
