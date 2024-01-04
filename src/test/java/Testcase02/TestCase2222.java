package Testcase02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TestCase2222 {
    WebDriver driver;
    WebDriverWait wait;
    public By korisnik = By.id("user-name");
    public By sifra = By.id("password");
    public By backpack = By.xpath("//div[@class='inventory_item_label']//a[@id='item_4_title_link']//div[contains(.,'Sauce Labs Backpack')]");
    public By addbackpack = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    public By backbutton = By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']");
    public By addjacket = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']");
    public By shoppingcart = By.xpath("//a[@class='shopping_cart_link']");
    public  By checkout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
    public By ime = By.id("first-name");
    public By prezime = By.id("last-name");
    public By postanskikod = By.id("postal-code");
    public By nastavi = By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']");
    public By finish = By.xpath("//button[@class='btn btn_action btn_medium cart_button']");

    @Test
    public void Testingstuff(){
        System.setProperty("webdriver.geckodriver", "\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
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

        driver.findElement(By.id("login-button")).click();

        clickonElement(backpack);
        driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//div[contains(.,'Sauce Labs Backpack')]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='inventory_details_price']")).isDisplayed();
        clickonElement(addbackpack);

        clickonElement(backbutton);

        clickonElement(addjacket);

        clickonElement(shoppingcart);

        clickonElement(checkout);

        WebElement firstname = driver.findElement(ime);
        firstname.isDisplayed();
        firstname.isEnabled();
        firstname.sendKeys("Milica");

        WebElement lastname = driver.findElement(prezime);
        lastname.isDisplayed();
        lastname.isEnabled();
        lastname.sendKeys("Jovanovic");

        WebElement zipcode = driver.findElement(postanskikod);
        zipcode.isDisplayed();
        zipcode.isEnabled();
        zipcode.sendKeys("34000");

        clickonElement(nastavi);

        clickonElement(finish);

        driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed();

        driver.findElement(By.id("react-burger-menu-btn")).click();

        driver.findElement(By.id("logout_sidebar_link")).click();

    }
    public void clickonElement(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).click();
    }
}