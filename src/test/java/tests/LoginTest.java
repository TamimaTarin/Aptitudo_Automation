package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.utils;
import base.baseTest;

import io.qameta.allure.*;

@Epic("Authentication")
@Feature("Login Feature")

public class LoginTest extends baseTest {

  @Test(priority = 0)
    @Story("User logs in with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void testValidLogin() throws InterruptedException {
    	String username = utils.getCellData("Sheet1", 0, 0);
        String password = utils.getCellData("Sheet1", 0, 1);
        
        if (username == null || password == null) {
            throw new IllegalArgumentException("Test data missing for login credentials");
        }

        performLogin(username, password);

        Thread.sleep(1200);  
    }

    @Step("Login with username: {username} and password: {password}")
    public void performLogin(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        Thread.sleep(3000); 
    
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

       
        Assert.assertEquals(currentUrl, "https://dev.cnsbd.com:2022/dashboard", "Unexpected URL after login");
        
        
    }
}