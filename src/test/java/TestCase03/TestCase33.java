package TestCase03;

import org.testng.annotations.Test;
import util.Metode;


public class TestCase33 extends Metode {

    String pricefrom = "5000";
    String priceto = "8000";

    @Test
    public void TestCase03() {

        Test3setup();

        //click detaljna pretraga
        clickonElement(detailed);

        WaitforTittle();

        //select audi
        clickonElement(selectbrand);
        clickonElement(selectAudi);

        //select model A4
        clickonElement(selectmodel);
        clickonElement(selectA4);

        //select price range from 5000
        type( priceFrom, pricefrom);
        //select price range to 8000
        type(priceTo, priceto);

        //select year range from 2005
        clickonElement(yearfrom);
        clickonElement(pick2005);

        //select year range to 2020
        clickonElement(yearto);
        clickonElement(pick2020);

        //select body type limuzina
        clickonElement(bodytype);
        clickonElement(limuzina);

        //select fuel benzin
        clickonElement(fuel);
        clickonElement(benzin);

        //select region Beograd
        clickonElement(region);
        clickonElement(beograd);

        //select number of doors 4/5
        clickonElement(doors);
        clickonElement(selectdoors);

        //press pretraga
        clickonElement(searchbutton);
    }
}