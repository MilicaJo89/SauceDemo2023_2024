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

    WebDriver driver;
    WebDriverWait wait;

    public By searchTitle = By.xpath("//h1[@class='searchTitle']");
    public By priceFrom = By.id("price_from");
    public By priceTo = By.id("price_to");
    public By selectbrand = By.xpath("//p[@title=' Marka']//label//i");
    public By selectAudi = By.xpath("//label[text()='Audi']");
    public By selectmodel = By.xpath("//p[@title=' Svi modeli']//label//i");
    public By selectA4 = By.xpath("//label[contains(.,'A4') and not(contains(.,'Allroad'))]//parent::li//span//i");
    public By yearfrom = By.xpath("//p[@title=' Godina od']//label//i");
    public By pick2005 = By.xpath("//label[contains(.,'2005 god.')]");
    public By yearto = By.xpath("//p[@title=' do']//label//i");
    public By pick2020 = By.xpath("//div[@class='SumoSelect sumo_year_to open']//div[@class='optWrapper']//ul[@class='options']//li[@class='opt']//label[contains(.,'2020 god.')]");
    public By bodytype = By.xpath("//p[@title=' Karoserija']//label//i");
    public By limuzina = By.xpath("//label[contains(.,'Limuzina')]//parent::li//span//i");
    public By fuel = By.xpath("//p[@title=' Vrsta goriva']//label//i");
    public By benzin = By.xpath("//label[contains(.,'Benzin') and not (contains(.,'+ Metan (CNG)'))and not(contains(.,'+ Gas (TNG)'))]//parent::li//span//i");
    public By region = By.xpath("//p[@title=' Region']//label//i");
    public By beograd = By.xpath("//label[contains(.,'Beograd') and not (contains(.,'uži')) and not (contains(.,'širi'))]//parent::li//span//i");
    public By doors = By.xpath("//p[@title=' Broj vrata']//label//i");
    public By selectdoors = By.xpath("//label[contains(.,'4/5 vrata')]");
    public By searchbutton = By.id("submit_1");

    @Test
    public void TestCase03(){

        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://www.polovniautomobili.com/");
        driver.findElement(By.cssSelector(".paBlueButtonPrimary")).click();
        driver.manage().window().maximize();

        //click detaljna pretraga
        driver.findElement(By.xpath("//button[@class='uk-width-1-1 uk-margin-small-bottom paGrayButtonSecundary  pr_advance_search_button']")).click();


        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(visibilityOf(driver.findElement(searchTitle)));



        //select audi
        clickOnElement(selectbrand);
        clickOnElement(selectAudi);

        //select model A4
        clickOnElement(selectmodel);
        clickOnElement(selectA4);

        //select price range from 5000
        WebElement pricefrom = driver.findElement(priceFrom);
        pricefrom.isDisplayed();
        pricefrom.isEnabled();
        pricefrom.click();
        pricefrom.sendKeys("5000");

        //select price range to 8000
        WebElement priceto = driver.findElement(priceTo);
        priceto.isDisplayed();
        priceto.isEnabled();
        priceto.click();
        priceto.sendKeys("8000");

        //select year range from 2005
        clickOnElement(yearfrom);
        clickOnElement(pick2005);

        //select year range to 2020
        clickOnElement(yearto);
        clickOnElement(pick2020);

        //select body type limuzina
        clickOnElement(bodytype);
        clickOnElement(limuzina);

        //select fuel benzin
        clickOnElement(fuel);
        clickOnElement(benzin);

        //select region Beograd
        clickOnElement(region);
        clickOnElement(beograd);

        //select number of doors 4/5
        clickOnElement(doors);
        clickOnElement(selectdoors);

        //press pretraga
       clickOnElement(searchbutton);
    }
    public void clickOnElement(By xpath){
        wait.until(visibilityOf(driver.findElement(xpath))).click();
    }
}
