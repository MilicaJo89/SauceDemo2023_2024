package Testcase02;

import org.testng.annotations.Test;
import util.Metode;

import java.io.IOException;


public class TestCase2222 extends Metode {


    @Test
    public void Testingstuff() throws IOException {

        logger.info("Opening saucedemo web page");
        SetupTest2();

        logger.info("Get username from properties file");
        String user1 = GetFromProperties("sauceuser");
        logger.info("Write the username in the username text field element");
        type(korisnik, user1);

        logger.info("Get password from properties file");
        String userp1 = GetFromProperties("saucepassword");
        logger.info("Write the password in to password text field element");
        type(sifra, userp1);

        logger.info("Click on Login element");
        clickonElement(loggin);

        logger.info("Click on Sauce Labs Backpack element");
        clickonElement(backpack);

        logger.info("Sauce Labs Backpack title element is present");
        ElementisPresent(backpacktitle);

        logger.info("Sauce Labs Backpack description element is present");
        ElementisPresent(backpackdescription);

        logger.info("Sauce Labs Backpack price element is present");
        ElementisPresent(backpackprice);

        logger.info("Click on add to cart under Sauce Labs Backpack element");
        clickonElement(addbackpack);

        logger.info("Click on Back button element");
        clickonElement(backbutton);

        logger.info("Click on add to cart element under the Sauce Labs Fleece Jacket element");
        clickonElement(addjacket);

        logger.info("Click on shopping cart element");
        clickonElement(shoppingcart);

        logger.info("Click on Checkout button element");
        clickonElement(checkout);

        logger.info("Get first name from the properties file");
        String name1 = GetFromProperties("firstname1");
        logger.info("Write in the first name in to the first name text field element");
        type(ime, name1);
        logger.info("Get last name from the properties file");
        String last1 = GetFromProperties("lastname1");
        logger.info("Write in the last name in to the last name text field element");
        type(prezime, last1);
        logger.info("Get zip code from properties file");
        String zip1 = GetFromProperties("test2zipcode");
        logger.info("Write in zip code in to the zip code text field element");
        type(postanskikod, zip1 );

        logger.info("Click on the Continue button element");
        clickonElement(nastavi);

        logger.info("Click on Finish button element");
        clickonElement(finish);

        logger.info("Thank you for your order message is present");
        ElementisPresent(messages);

        logger.info("Click on Burger menu element");
        clickonElement(openmenu);

        logger.info("Click on the logout element in the burger menu element");
        clickonElement(loggout);
    }
}