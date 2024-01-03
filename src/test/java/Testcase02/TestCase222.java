package Testcase02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestCase222 {


    @Test
    public void TestCase02() {
        System.setProperty("webdriver.geckodriver", "\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("secret_sauce");


        driver.findElement(By.id("login-button")).click();


        driver.findElement(By.xpath("//div[@class='inventory_item_label']//a[@id='item_4_title_link']//div[contains(.,'Sauce Labs Backpack')]")).click();
        driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']//div[contains(.,'Sauce Labs Backpack')]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='inventory_details_price']")).isDisplayed();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();


        driver.findElement(By.id("back-to-products")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        driver.findElement(By.id("checkout")).click();

        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.isDisplayed();
        firstname.isEnabled();
        firstname.sendKeys("Milica");

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.isDisplayed();
        lastname.isEnabled();
        lastname.sendKeys("Jovanovic");

        WebElement zipcode = driver.findElement(By.id("postal-code"));
        zipcode.isDisplayed();
        zipcode.isEnabled();
        zipcode.sendKeys("34000");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed();

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


}
