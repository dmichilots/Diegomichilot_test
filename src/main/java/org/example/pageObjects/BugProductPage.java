package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BugProductPage {
    WebDriver driver;

    public BugProductPage (WebDriver driver){

        this.driver = driver;
    }
    By shopKidsButton = By.cssSelector("a[href='/kids']");
    By getOneProduct = By.cssSelector("a[href=\"/kids/nmd_r1-shoes-10\"][class=\"font-bold hover:underline h5\"]");
    By quantity = By.name("qty");
    By size = By.xpath("//a[normalize-space()='X']");
    By color = By.xpath("//a[normalize-space()='White']");
    By addCardButton = By.cssSelector("button[type='button']");
    By getSecond = By.cssSelector("a[href=\"/kids/swift-run-x-shoes-14\"][class=\"font-bold hover:underline h5\"]");
    By sizeTwo = By.xpath("//a[normalize-space()='S']");
    By colorTwo = By.xpath("//a[normalize-space()='Red']");
    By getThird = By.cssSelector("a[href=\"/kids/chuck-taylor-all-star-70\"][class=\"font-bold hover:underline h5\"]");
    By colorThree = By.xpath("//a[normalize-space()='Black']");
    By sizeThree = By.xpath("//a[normalize-space()='L']");
    By viewCard = By.cssSelector("a[href=\"/cart\"][class=\"add-cart-popup-button\"]");
    By goToCheckOut = By.cssSelector("a[href='/checkout']");
    By address = By.name("email");
    By continueButton = By.cssSelector("button[class='button primary']");
    By nameforn = By.name("address[full_name]");
    By phoneNumber = By.name("address[telephone]");
    By addressTwo = By.name("address[address_1]");
    By city = By.name("address[city]");
    By list = By.name("address[country]");
    By china = By.cssSelector("option[value='CN']");
    By province = By.name("address[province]");
    By provinceSelected = By.cssSelector("option[value=\"CN-35\"]");
    By postCode = By.name("address[postcode]");
    By type = By.cssSelector("label[for='method1']");
    By selectMetohd = By.xpath("//img[@alt='Cash On Delivery']//parent::div//parent::div//child::a");
    By checkIcon = By.cssSelector("div[class='check flex justify-center self-center text-interactive']");



    public void getFirstProduct(){
        driver.findElement(shopKidsButton).click();
        driver.findElement(getOneProduct).click();
        driver.findElement(size).click();
        driver.findElement(color).click();
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys("2");
        driver.findElement(addCardButton).click();
    }
    public void getSecondProduct(){
        driver.findElement(shopKidsButton).click();
        driver.findElement(getSecond).click();
        driver.findElement(sizeTwo).click();
        driver.findElement(colorTwo).click();
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys("3");
        driver.findElement(addCardButton).click();
    }
    public void getThirdProduct(){
        driver.findElement(shopKidsButton).click();
        driver.findElement(getThird).click();
        driver.findElement(sizeThree).click();
        driver.findElement(colorThree).click();
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys("4");
        driver.findElement(addCardButton).click();
    }
    public void goToCardView(){
        driver.findElement(viewCard).click();
        driver.findElement(goToCheckOut).click();
    }
    public void fillform(){
        driver.findElement(address).sendKeys("test1@gmail.com");
        driver.findElement(continueButton).click();
        driver.findElement(nameforn).sendKeys("Test Diego");
        driver.findElement(phoneNumber).sendKeys("924577552");
        driver.findElement(addressTwo).sendKeys("Jr san juan 24");
        driver.findElement(city).sendKeys("Lima");
        driver.findElement(list).click();
        driver.findElement(china).click();
        driver.findElement(province).click();
        driver.findElement(provinceSelected).click();
        driver.findElement(postCode).sendKeys("3476");
        driver.findElement(continueButton).click();
        driver.findElement(type).click();
        driver.findElement(continueButton).click();
    }

    public void paymentInformation(){
        driver.findElement(selectMetohd).click();
        driver.findElement(continueButton).click();
    }


    public boolean checkIconIsDisplayed(){
        return driver.findElement(checkIcon).isDisplayed();
    }
}
