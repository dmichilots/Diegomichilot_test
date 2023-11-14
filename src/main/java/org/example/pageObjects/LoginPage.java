package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By loginButton = By.cssSelector("a[href='/account/login']");
    By createButton = By.cssSelector("a[href='/account/register']");
    By nameField = By.name("full_name");
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By signUpButton = By.cssSelector("button[class='button primary']");
    By shopKidsButton = By.cssSelector("a[href='/kids']");
    public void getLoginButton(){
        driver.findElement(loginButton).click();
        driver.findElement(createButton).click();
        driver.findElement(nameField).sendKeys("Diego Michilot Shimazu");
        driver.findElement(emailField).sendKeys("diegomichilot20@gmail.com");
        driver.findElement(passwordField).sendKeys("Test123");
        driver.findElement(signUpButton).click();
    }

}
