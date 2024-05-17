package TestCase01;


import org.testng.annotations.Test;
import util.Metode;

import java.io.IOException;

public class TestCase11 extends Metode {

    @Test
    public void Test11() throws IOException {

        logger.info("Opening the saucedemo web page");
        SetupTesta1();

        logger.info("Get username from properties file");
        String sauce = GetFromProperties("sauceuser");
        logger.info("Write in the username in the username field");
        type(saucekorisnik,sauce );
        logger.info("Get password from the properties file");
        String saucep = GetFromProperties("saucepassword");
        logger.info("Write in password in the password field");
        type(saucesifra, saucep);

        //login button//
        logger.info("Click on login button");
        clickonElement(login1);

        //product//
        logger.info("Product page element is present");
        ElementisPresent(product);

        //shopping cart//
        logger.info("Shopping cart element is present");
        ElementisPresent(shoppingcart1);
        logger.info("Shopping cart element is enabled");
        ElementisEnabled(shoppingcart1);

        //twitter//
        logger.info("Twitter link element is present");
        ElementisPresent(twitter);
        logger.info("Twitter element is enabled");
        ElementisEnabled(twitter);

        //facebook//
        logger.info("Facebook link element is present");
        ElementisPresent(facebook);
        logger.info("Facebook link element is enabled");
        ElementisEnabled(facebook);

        //linkedin//
        logger.info("Linkedin link element is present");
        ElementisPresent(linkedin);
        logger.info("Linkedin link element is enabled");
        ElementisEnabled(linkedin);

        //burger-menu//
        logger.info("Burger menu element is present");
        ElementisPresent(burgermenu);
        logger.info("Burger menu element is enabled");
        ElementisEnabled(burgermenu);
        logger.info("Click on burger menu element");
        clickonElement(burgermenu);

        //logout//
        logger.info("Logout element in the burger menu element is present");
        ElementisPresent(logout);
        logger.info("Logout element in the burger menu element is enabled");
        ElementisEnabled(logout);
        logger.info("Click on logout element in burger manu element");
        clickonElement(logout);
        /*driver.close();*/
    }
}
