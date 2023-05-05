package org.example;

import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    RegistrationMessage registrationMessage = new RegistrationMessage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

@Test
    public void Usershouldbeabletologin()
    {
    homePage.UserShouldBeAbleClickOnRegisterButton();
    registerPage. UserShouldBeAbleToRegisterSuccessfully();
    registrationMessage.UserShouldBeAbleToSeeRegistrationMessage();


    }

    @Test

    public void UserShouldBeAbleToSeeOnlyRegisteredUsersCanVoteMessage()
    {

    homePage.UserShouldBeAbleToSeeAnErrorMessagewhileVoting();
    }

    @Test

        public void UserShouldBeAbleToSeeOnlyRegisteredCustomersCanUseEmailAFriendFeature ()
    {
        homePage.Usershouldbeabletoaddaproducttocart();
        appleMacBookPage.UsershouldbeabletoAddDetailsclickonemailafriendbutton();
        emailAFriendPage.UserShouldBeAbleToTypeInDetailsToEmailAFriend();
    }
}
