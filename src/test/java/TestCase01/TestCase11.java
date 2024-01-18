package TestCase01;


import org.testng.annotations.Test;
import util.Metode;

public class TestCase11 extends Metode {

    String sauceuser = "standard_user";
    String saucepassword = "secret_sauce";

    @Test
    public void Test11(){

        SetupTesta1();

        type(saucekorisnik, sauceuser);
        type(saucesifra, saucepassword);

        //login button//
        clickonElement(login1);

        //product//
        ElementisPresent(product);

        //shopping cart//
        ElementisPresent(shoppingcart1);
        ElementisEnabled(shoppingcart1);

        //twitter//
        ElementisPresent(twitter);
        ElementisEnabled(twitter);

        //facebook//
        ElementisPresent(facebook);
        ElementisEnabled(facebook);

        //linkedin//
        ElementisPresent(linkedin);
        ElementisEnabled(linkedin);

        //burger-menu//
        ElementisPresent(burgermenu);
        ElementisEnabled(burgermenu);
        clickonElement(burgermenu);

        //logout//
        ElementisPresent(logout);
        ElementisEnabled(logout);
        clickonElement(logout);
        /*driver.close();*/
    }
}
