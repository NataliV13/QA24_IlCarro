package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginSuccess(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("jon@gmail.com","Jj9876%$#123");
        app.getHelperUser().submitRegistration();








    }

}
