package TestCase03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class TestCase33 {


    @Test
    public void TestCase03(){
        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.polovniautomobili.com/");
        driver.findElement(By.cssSelector(".paBlueButtonPrimary")).click();
        driver.manage().window().maximize();




        //click detaljna pretraga
        driver.findElement(By.name("isDetailed")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(visibilityOf(driver.findElement(By.xpath("//h1[@class='searchTitle']"))));



        /*driver.findElement(By.xpath("//h1[@class='searchTitle']")).isDisplayed();*/


        //select audi

        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_brand']//p[@title=' Marka']//label//i")).click();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_brand open']//div[@class='optWrapper']//ul[@class='options']//label[text()='Audi']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_brand open']//div[@class='optWrapper']//ul[@class='options']//label[text()='Audi']")).click();




        //select model A4
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_model']//p[@title=' Svi modeli']//label//i")).click();
        driver.findElement(By.xpath("//label[contains(.,'A4') and not(contains(.,'Allroad'))]//parent::li//span//i")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'A4') and not(contains(.,'Allroad'))]//parent::li//span//i")).click();




        //select price range from 5000
        WebElement pricefrom = driver.findElement(By.id("price_from"));
        pricefrom.isDisplayed();
        pricefrom.isEnabled();
        pricefrom.click();
        pricefrom.sendKeys("5000");



        //select price range to 8000
        WebElement priceto = driver.findElement(By.id("price_to"));
        priceto.isDisplayed();
        priceto.isEnabled();
        priceto.click();
        priceto.sendKeys("8000");



        //select year range from 2005
        driver.findElement(By.xpath("//p[@title=' Godina od']//label//i")).click();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_year_from open']//div[@class='optWrapper']//ul[@class='options']//li[@class='opt']//label[contains(.,'2005 god.')]")).isEnabled();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_year_from open']//div[@class='optWrapper']//ul[@class='options']//li[@class='opt']//label[contains(.,'2005 god.')]")).click();




        //select year range to 2020
        driver.findElement(By.xpath("//p[@title=' do']//label//i")).click();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_year_to open']//div[@class='optWrapper']//ul[@class='options']//li[@class='opt']//label[contains(.,'2020 god.')]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='SumoSelect sumo_year_to open']//div[@class='optWrapper']//ul[@class='options']//li[@class='opt']//label[contains(.,'2020 god.')]")).click();




        //select body type limuzina
        driver.findElement(By.xpath("//p[@title=' Karoserija']//label//i")).click();
        driver.findElement(By.xpath("//label[contains(.,'Limuzina')]//parent::li//span//i")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'Limuzina')]//parent::li//span//i")).click();




        //select fuel benzin
        driver.findElement(By.xpath("//p[@title=' Vrsta goriva']//label//i")).click();
        driver.findElement(By.xpath("//label[contains(.,'Benzin') and not (contains(.,'+ Metan (CNG)'))and not(contains(.,'+ Gas (TNG)'))]//parent::li//span//i")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'Benzin') and not (contains(.,'+ Metan (CNG)'))and not(contains(.,'+ Gas (TNG)'))]//parent::li//span//i")).click();




        //select region Beograd
        driver.findElement(By.xpath("//p[@title=' Region']//label//i")).click();
        driver.findElement(By.xpath("//label[contains(.,'Beograd') and not (contains(.,'uži')) and not (contains(.,'širi'))]//parent::li//span//i")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'Beograd') and not (contains(.,'uži')) and not (contains(.,'širi'))]//parent::li//span//i")).click();



        //select number of doors 4/5
        driver.findElement(By.xpath("//p[@title=' Broj vrata']//label//i")).click();
        driver.findElement(By.xpath("//label[contains(.,'4/5 vrata')]")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'4/5 vrata')]")).click();




        //press pretraga
        driver.findElement(By.id("submit_1")).isDisplayed();
        driver.findElement(By.id("submit_1")).click();


    }

}
