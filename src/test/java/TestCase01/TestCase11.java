package TestCase01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TestCase11 {

    WebDriver driver;

    WebDriverWait wait;

    public By korisnik = By.id("user-name");
    public By sifra = By.id("password");
    public By login = By.id("login-button");
    public By product = By.xpath("//span[@class='title']");
    public By shoppingcart = By.xpath("//a[@class='shopping_cart_link']");
    public By twitter = By.xpath("//li[@class='social_twitter']");
    public By facebook = By.xpath("//li[@class='social_facebook']");
    public By linkedin = By.xpath("//li[@class='social_linkedin']");
    public By burgermenu = By.id("react-burger-menu-btn");
    public By logout = By.id("logout_sidebar_link");

    @Test
    public void Test11(){

        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = driver.findElement(korisnik);
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(sifra);
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("secret_sauce");

        //login button//
        clickonElement(login);

        //product//
        ElementisPresent(product);

        //shopping cart//
        ElementisPresent(shoppingcart);
        ElementisEnabled(shoppingcart);

        //twitter//
        ElementisPresent(twitter);
        ElementisEnabled(twitter);

        //facebook//
        ElementisPresent(facebook);
        ElementisEnabled(facebook);

        //linkedin//
        ElementisPresent(linkedin);
        ElementisEnabled(linkedin);

        //burger-menu//
        ElementisPresent(burgermenu);
        ElementisEnabled(burgermenu);
        clickonElement(burgermenu);

        //logout//
        ElementisPresent(logout);
        ElementisEnabled(logout);
        clickonElement(logout);

        /*driver.close();*/
    }

    public void clickonElement(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).click();
    }
    public void ElementisPresent(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).isDisplayed();
    }
    public void ElementisEnabled(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).isDisplayed();
    }
}
