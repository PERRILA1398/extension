package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    RegistrationMessage registrationMessage = new RegistrationMessage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    NikeProductsPage nikeProductsPage= new NikeProductsPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage= new BuildYourOwnComputerPage();

    GuestCheckoutPage guestCheckoutPage = new GuestCheckoutPage();

    Paymentcheckoutpage paymentcheckoutpage = new Paymentcheckoutpage();

    OrderFinalPage orderFinalPage= new OrderFinalPage();

    OrderConfirmationPage orderConfirmationPage= new OrderConfirmationPage();

    @Test
    public void Usershouldbeabletoregister() {
        homePage.UserShouldBeAbleClickOnRegisterButton();
        registerPage.UserShouldBeAbleToRegisterSuccessfully();
        registrationMessage.UserShouldBeAbleToSeeRegistrationMessage();



    }

    @Test

    public void UserShouldBeAbleToSeeOnlyRegisteredUsersCanVoteMessage() {

        homePage.UserShouldBeAbleToSeeAnErrorMessagewhileVoting();
    }

    @Test

    public void UserShouldBeAbleToSeeOnlyRegisteredCustomersCanUseEmailAFriendFeature() {
        homePage.Usershouldbeabletoaddaproducttocart();
        appleMacBookPage.UsershouldbeabletoAddDetailsclickonemailafriendbutton();
        emailAFriendPage.UserShouldBeAbleToTypeInDetailsToEmailAFriend();

    }

    @Test
    public void Printproducttitles() {
        homePage.ToPrintproducttitles();
    }

    @Test
    public void Accept() {
     homePage.clickonsearchbutton();
    }

    @Test
    public void UseShouldBeAbleToSelectAndVerifyCurrencySelecterAccordingly (){
        homePage.UseShouldBeAbleToSelectCurrencySelecter();
    }
    @Test
    public void Usershouldbeabletosearchforthegivenproductsuccessfully(){
        homePage.UserShouldBeAbleToSearchNikeItems();
        nikeProductsPage.UsershouldbetoseeallNikeProducts();


    }
    @Test
    public void UsershouldbeabletoseetheiraddedcommentatthelastonNewreleasePage ()
    {
        homePage.Usershouldbeabletoclickonnewrelease();
        newReleasePage.UsershouldbeonNewreleasepage();

    }

   @Test

    public void UsershouldbeabletoBuildtheirowncomputer ()
   {
        homePage.UsershouldbeabletoclickonBuildyourowncomputer();
        buildYourOwnComputerPage.TypeinBuildyourComputerdetails();
        shoppingCartPage.Useshouldbeonshoppingcartpage();

   }


   @Test
   public void UseShouldBeAbleToCheckOutAsAGuestUserForBuildYourComputer ()
   {
        homePage.UsershouldbeabletoclickonBuildyourowncomputer();
        buildYourOwnComputerPage.TypeinBuildyourComputerdetails();
       shoppingCartPage.UsershouldbeabletocheckoutasaGuestUser();
        guestCheckoutPage.Usershouldbeonguestcheckoutpage();
        paymentcheckoutpage.Usershouldbeonpaymentpage();
        orderFinalPage.Usershouldbeonorderfinalpage();
        orderConfirmationPage.usershouldbeabletoseeanorderconfirmationmessage();


   }
}

