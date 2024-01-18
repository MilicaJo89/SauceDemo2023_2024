package OldTestsDontRun;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase1 {


    public static void main(String[] args) {

        System.setProperty("webdriver.geckodriver","\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
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

        //loginbutton//
        driver.findElement(By.id("login-button")).click();

        //product//
        driver.findElement(By.className("title")).isDisplayed();

        //shoppingcart//
        driver.findElement(By.className("shopping_cart_link")).isDisplayed();
        driver.findElement(By.className("shopping_cart_link")).isEnabled();

        //twitter//
        driver.findElement(By.className("social_twitter")).isDisplayed();
        driver.findElement(By.className("social_twitter")).isEnabled();

        //facebook//
        driver.findElement(By.className("social_facebook")).isDisplayed();
        driver.findElement(By.className("social_facebook")).isEnabled();

        //linkedin//
        driver.findElement(By.className("social_linkedin")).isDisplayed();
        driver.findElement(By.className("social_linkedin")).isEnabled();

        //burger-menu//
        driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
        driver.findElement(By.id("react-burger-menu-btn")).isSelected();
        driver.findElement(By.id("react-burger-menu-btn")).click();

        //logout//
        driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
        driver.findElement(By.id("logout_sidebar_link")).isEnabled();
        driver.findElement(By.id("logout_sidebar_link")).click();

        driver.close();


    }


}
