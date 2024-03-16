package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser  extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void openLoginRegistrationForm(){
        WebElement loginTab = wd.findElement(By.cssSelector("a[href='login']"));
        // WebElement loginTab1= wd.findElement(By.xpath("//a[text()='Log in']"));
        loginTab.click();
        //click(By.cssSelector("a[href='login']"));
    }
    public void fiiLoginRegisrtationForm(String email, String password){
        WebElement emailInput  = wd.findElement(By.xpath("//input[@id='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
        //type(By.xpath("//input[@id='email']"),email);

        WebElement passwordInput =wd.findElement(By.xpath("//input[@id='password']"));
        //WebElement passwordInput2 = wd.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        //type(By.name("password"),password);
    }
    public void submitLogin(){

        click(By.xpath("//button[text()='Y’alla!']"));
    }

}
