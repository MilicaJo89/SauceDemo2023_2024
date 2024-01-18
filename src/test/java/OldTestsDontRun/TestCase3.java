package OldTestsDontRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TestCase3 {

    @Test
    public void TestCase03(){
        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.polovniautomobili.com/");
        driver.findElement(By.cssSelector(".paBlueButtonPrimary")).click();
        driver.manage().window().maximize();



        //click detaljna pretraga
        driver.findElement(By.xpath("/html/body/div[9]/div/h1")).isDisplayed();

        driver.findElement(By.name("isDetailed")).click();


        //select audi
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[1]/div/p/label/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[1]/div/div/ul/li[4]/label")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[1]/div/div/ul/li[4]/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[1]/div/div/ul/li[4]/label")).isSelected();



        //select model A4
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[2]/div/p/label/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/ul/li[8]/span/i")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/ul/li[8]/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/ul/li[8]/span/i")).isSelected();



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
        priceto.sendKeys("8000");



        //select year range from 2005
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[1]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[1]/div/div/ul/li[21]")).isEnabled();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[1]/div/div/ul/li[21]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[1]/div/div/ul/li[21]")).isSelected();



        //select year range to 2020
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[2]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[2]/div/div/ul/li[6]")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[2]/div/div/ul/li[6]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[6]/div/div[2]/div/div/ul/li[6]")).isSelected();



        //select body type limuzina
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[7]/div/div[1]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[7]/div/div[1]/div/div/ul/li[1]/span/i")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[7]/div/div[1]/div/div/ul/li[1]/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[7]/div/div[1]/div/div/ul/li[1]/span/i")).isSelected();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[7]/div/div[1]/div/p/label")).click();



        //select fuel benzin
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[8]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[8]/div/div/ul/li[1]/span/i")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[8]/div/div/ul/li[1]/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[8]/div/div/ul/li[1]/span/i")).isSelected();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[8]/div/p/label")).click();



        //select region Beograd
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[11]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[11]/div/div/ul/li[1]/ul/li[1]/span/i")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[11]/div/div/ul/li[1]/ul/li[1]/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[11]/div/div/ul/li[1]/ul/li[1]/span/i")).isSelected();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[11]/div/p/label")).click();



        //select number of doors 4/5
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[12]/div/p/label")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[12]/div/div/ul/li[3]")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[12]/div/div/ul/li[3]")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[1]/div[1]/div/div[12]/div/div/ul/li[3]")).isSelected();




        //press pretraga
        driver.findElement(By.id("submit_1")).isDisplayed();
        driver.findElement(By.id("submit_1")).click();

        driver.findElement(By.xpath("/html/body/div[9]/div/h1")).isDisplayed();

    }
}
