package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginSuccess(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fiiLoginRegisrtationForm("olesia@gmail.com","OLol432&123");
        app.getHelperUser().submit();


       // Assert.assertTrue(app.getHelperUser().isLogget());

    }

}
