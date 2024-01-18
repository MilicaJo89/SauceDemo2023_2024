package Testcase02;

import org.testng.annotations.Test;
import util.Metode;


public class TestCase2222 extends Metode {


    String username = "standard_user";
    String password = "secret_sauce";
    String firstname = "Milica";
    String lastname = "Jovanovic";
    String test2zipcode = "34000";

    @Test
    public void Testingstuff() {

        SetupTest2();

        type(korisnik, username);
        type(sifra, password);

        clickonElement(loggin);

        clickonElement(backpack);

        ElementisPresent(backpacktitle);

        ElementisPresent(backpackdescription);

        ElementisPresent(backpackprice);

        clickonElement(addbackpack);

        clickonElement(backbutton);

        clickonElement(addjacket);

        clickonElement(shoppingcart);

        clickonElement(checkout);

        type(ime, firstname);
        type(prezime, lastname);
        type(postanskikod, test2zipcode);

        clickonElement(nastavi);

        clickonElement(finish);

        ElementisPresent(messages);

        clickonElement(openmenu);

        clickonElement(loggout);
    }
}