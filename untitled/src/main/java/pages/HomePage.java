package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static browser.Browser.getPropertyValue;

public class HomePage {
 @FindBy(how = How.NAME, using = "username") private WebElement userNameElement;
    @FindBy(how = How.NAME, using = "password")private WebElement passwordElement;


    public void LogIn(){
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("password"));

    }

}


