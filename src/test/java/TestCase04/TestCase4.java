package TestCase04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase4 {
    @Test
    public void Test04 (){

        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.polovniautomobili.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/div/a[7]")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/div/a[7]")).click();

        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[7]/a")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[7]/a")).click();


        WebElement email = driver.findElement(By.id("email"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys("tinaturner90@protonmail.com");

        WebElement password = driver.findElement(By.id("password_first"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Queentina90*");

        WebElement repeatedpassword = driver.findElement(By.id("password_second"));
        repeatedpassword.isDisplayed();
        repeatedpassword.isEnabled();
        repeatedpassword.sendKeys("Queentina90*");




    }
}
