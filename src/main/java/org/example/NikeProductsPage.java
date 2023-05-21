package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NikeProductsPage extends Utils {
    public void UsershouldbetoseeallNikeProducts() {
        List<WebElement> Nikeproducts = driver.findElements(By.cssSelector("div[class='item-grid']"));
        for (WebElement e : Nikeproducts) {
            System.out.println(e.getText().contains("Nike"));


        }
    }
}


