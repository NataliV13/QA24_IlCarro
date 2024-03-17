package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess1() {
        User user = new User().withEmail("margo@gmail.com").withPassword("Mmar123456$");
        //        user.setEmail("marga@gmail.com");
//        user.setPassword("Mmar123456$");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submitLogin();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        //app.getHelperUser().clickOkButton();

    }


    @Test
    public void loginSuccess() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("marga@gmail.com", "Mmar123456$");
        app.getHelperUser().submitLogin();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        //app.getHelperUser().clickOkButton();

    }

    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("marga@gmail.com", "Mmar123456$");
        app.getHelperUser().submitLogin();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        //app.getHelperUser().clickOkButton();

    }

    @Test
    public void loginWrongEmail() {

    }

    @Test
    public void loginWongPassword() {

    }

    @AfterMethod
    public void postCondition() {
        app.getHelperUser().clickOkButton();
    }
}
