package org.example;

import org.openqa.selenium.By;

public class Paymentcheckoutpage  extends Utils
{

    By _shippingdate = By.cssSelector("input[id=shippingoption_1]");

    By _shippingcontinue= By.xpath("(//button[@type='button' ]) [10]");

    By _paymenttype= By.cssSelector("input[id=paymentmethod_1]");

    By _continuecard = By.xpath("(//button[@name='save']) [2]");

    By _cardtype = By.cssSelector("select[class=dropdownlists]");

    By _cardholdername= By.cssSelector("input[id=CardholderName]");

    By _cardnumber= By.cssSelector("input[id=CardNumber]");

    By _expiry1 = By.cssSelector("select[id=ExpireMonth]");

    By _expiry2 = By.cssSelector("select[id=ExpireYear]");

    By _cvv= By.cssSelector("input[id=CardCode]");

    By _cardcontinue = By.xpath("(//button[@type='button']) [12]");



    public void Usershouldbeonpaymentpage()
    {
        ClickOnElement(_shippingdate);
        ClickOnElement(_shippingcontinue);
        ClickOnElement(_paymenttype);
        ClickOnElement(_continuecard);
        selectbyValue(_cardtype, "visa");
        TypeText(_cardholdername, "Katelynn Dibbert");
        TypeText(_cardnumber, "4024007137626452 ");
        selectBytext(_expiry1, "04");
        selectbyValue(_expiry2, "2027");
        TypeText(_cvv, "410");
        ClickOnElement(_cardcontinue);



    }
}
