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
        User user = new User().whithEmail("jon@gmail.com").withPassword("Jj9876%$#123");
        //user.setEmail("jon@gmail.com");
        //user.setPassword("Jj9876%$#123");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        //app.getHelperUser().clickOkButton();
    }
    @Test
    public void loginSuccess() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("jon@gmail.com", "Jj9876%$#123");
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
        //app.getHelperUser().clickOkButton();
    }
    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("jon@gmail.com", "Jj9876%$#123");
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
       // app.getHelperUser().clickOkButton();
    }
   @Test
   public void loginWrongEmail() {
       app.getHelperUser().openLoginForm();
       app.getHelperUser().fillLoginForm("jongmail.com", "Jj9876%$#123");
       app.getHelperUser().submit();
       Assert.assertEquals(app.getHelperUser().getErrorText(),"It'snot look like email");
       Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());
    }

    @Test
    public void loginWrongPassword() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("jong@mail.com", "9876%$#123");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(),"\"Login or Password incorrect\"");

    }

    @Test
    public void loginUnregistered(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("pol@gmail.com", "98pol6%$#123");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(), "\"Login or Password incorrect\"");

    }
    @AfterMethod
    public void postCondition() {
        app.getHelperUser().clickOkButton();
    }
}
