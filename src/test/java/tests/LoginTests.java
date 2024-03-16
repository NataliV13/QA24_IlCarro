package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void test(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fiiLoginRegisrtationForm("kolia@gmail.com","kL76543$%21");
        app.getHelperUser().submitLogin();

    }

}
