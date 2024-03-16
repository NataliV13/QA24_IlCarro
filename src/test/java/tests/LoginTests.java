package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void test(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fiiLoginRegisrtationForm("ivan@gmail.com","In()123456!");
        app.getHelperUser().submitLogin();

    }

}
