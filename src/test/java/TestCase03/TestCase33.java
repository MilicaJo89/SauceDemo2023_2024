package TestCase03;


import org.testng.annotations.Test;
import util.Metode;

import java.io.IOException;


public class TestCase33 extends Metode {


    @Test
    public void TestCase03() throws IOException {

        logger.info("Opening polovniautomobili web page");
        Test3setup();


        //click detaljna pretraga
        logger.info("Click on Detaljna button element");
        clickonElement(detailed);

        logger.info("Wait for the tittle element to be present");
        WaitforTittle();

        //select audi
        logger.info("Click on Marka element");
        clickonElement(selectbrand);
        logger.info("Click on Audi element");
        clickonElement(selectAudi);

        //select model A4
        logger.info("Click on Svi modeli element");
        clickonElement(selectmodel);
        logger.info("Click on A4 element");
        clickonElement(selectA4);

        //select price range from 5000
        logger.info("Click on cena od text field element");
        clickonElement(priceFrom);
        logger.info("Get price from from properties file");
        String PriceFrom = GetFromProperties("pricefrom");
        logger.info("Write price from in the cena od text field element");
        type( priceFrom, PriceFrom);
        //select price range to 8000
        logger.info("Get price to from properties file");
        String PriceTo = GetFromProperties("priceto");
        logger.info("Write in the price to in to cena do text field element");
        type(priceTo, PriceTo);

        //select year range from 2005
        logger.info("Click on Godina od element");
        clickonElement(yearfrom);
        logger.info("Click on 2005 element in the Godina od element");
        clickonElement(pick2005);

        //select year range to 2020
        logger.info("Click od Godina do element");
        clickonElement(yearto);
        logger.info("Click on 2020 element in the Godina do element");
        clickonElement(pick2020);

        //select body type limuzina
        logger.info("Click on Karoserija element");
        clickonElement(bodytype);
        logger.info("Click on Limuzina element in Karoserija element");
        clickonElement(limuzina);

        //select fuel benzin
        logger.info("Click on Vrsta goriva element");
        clickonElement(fuel);
        logger.info("Click on Benzin in Vrsta goriva elemnet");
        clickonElement(benzin);

        //select region Beograd
        logger.info("Click on Region element");
        clickonElement(region);
        logger.info("Click on Beograd element in Region element");
        clickonElement(beograd);

        //select number of doors 4/5
        logger.info("Click on Broj vrata element");
        clickonElement(doors);
        logger.info("Click on 4/5 element in Broj vrata element");
        clickonElement(selectdoors);

        //press pretraga
        logger.info("Click Pretraga button element");
        clickonElement(searchbutton);
    }
}