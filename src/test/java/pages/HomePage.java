package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By dashboardTitle = By.xpath("//title[normalize-space()='Aptitudo - Dashboard']");  

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

}