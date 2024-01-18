package OldTestsDontRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestCase2 {

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


        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[2]")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[3]")).isDisplayed();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();


        driver.findElement(By.id("back-to-products")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();

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

        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2")).isDisplayed();

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

}






