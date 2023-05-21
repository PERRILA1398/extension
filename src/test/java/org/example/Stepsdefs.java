package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Stepsdefs extends Utils
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationMessage registrationMessage = new RegistrationMessage();


    @Given("User is on HomePage")
    public void user_is_on_home_page() {
        homePage.UserShouldBeAbleClickOnRegisterButton();


    }
    @When("User types in their details")
    public void user_types_in_their_details() {
        registerPage.UserShouldBeAbleToRegisterSuccessfully();


    }
    @Then("User should be able to register successfully")
    public void user_should_be_able_to_register_successfully() {
        registrationMessage.UserShouldBeAbleToSeeRegistrationMessage();




    }


    @Given("I am on Demo nopcommerce homepage")
    public void iAmOnDemoNopcommerceHomepage() {

    }

    @When("I click on {string}button")
    public void iClickOnButton(String button_name)
    {
        ClickOnElement(By.xpath("//a[text()='" +button_name+ " ']"));
    }



    @Then("I should be able to verify that I am navigated to the {string}")
    public void iShouldBeAbleToVerifyThatIAmNavigatedToThe(String page_url)
    {
      Assert.assertEquals(driver.getCurrentUrl(), page_url);
    }

    @And("I should verify th page title as {string}")
    public void iShouldVerifyThPageTitleAs(String page_title)
    {
       Assert.assertEquals( Gettext(By.tagName("h1")), page_title);

    }
}





