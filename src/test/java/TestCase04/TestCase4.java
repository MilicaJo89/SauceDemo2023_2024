package TestCase04;

import org.testng.annotations.Test;

public class TestCase4 extends Metode {

    final String password = "Queentina90*";
    String protomail = "tinaturner90@protonmail.com";
    String firsname = "Tina";
    String lastname = "Turner";
    String address = "Glendale 13";
    String city = "Kragujevac";
    String zipcode = "34000";
    String cellphone = "0641625989";

    @Test
    public void Test04 () throws InterruptedException  {

        Setup();
        //click posltavi oglas//
        ElementisPresent(oglas);
        clickonElement(oglas);

        //click registruj se//
        ElementisPresent(registracija);
        clickonElement(registracija);

        //fill the boxes//
        String generatedEmail = generateemail();
        type(mail,generatedEmail);
        type(sifra1,password);
        type(sifra2,password);

        //check the comboboxes//
        ElementisPresent(prodajacheckbox);
        clickonElement(prihvatamcheckbox);
        ElementisPresent(prodajacheckbox);
        clickonElement(prodajacheckbox);
        ElementisPresent(kupovinacheckbox);
        clickonElement(kupovinacheckbox);

        //click registruj se//
        ElementisPresent(regbutton);
        clickonElement(regbutton);

        //validate that the "hvala na registraciji" message is present//
        Thread.sleep(3000);
        ElementisPresent(poruka);

        //open new tab for protonmail//
        ProtonSetup();
        Thread.sleep(5000);

        //login proces//
        ElementisPresent(protonmail);
        clickonElement(protonmail);
        type(protonmail,protomail);
        ElementisPresent(protonpass);
        clickonElement(protonpass);
        type(protonpass,password);

        //click login button//
        ElementisPresent(login);
        clickonElement(login);

        //open the activation email//
        Thread.sleep(9000);
        ElementisPresent(emailtitle);
        clickonElement(emailtitle);
        Thread.sleep(5000);
        scrolldown();
        Thread.sleep(4000);
        ElementisPresent(linkmail);
        clickonElement(linkmail);
        Thread.sleep(5000);
        ElementisPresent(clickonit);
        clickonElement(clickonit);

        switchpages();
        Thread.sleep(3000);

        //click on elements//
        ElementisPresent(interestedinbuying);
        clickonElement(interestedinbuying);
        ElementisPresent(interestedinselling);
        clickonElement(interestedinselling);
        ElementisPresent(interestedinreviweing);
        clickonElement(interestedinreviweing);

        //click button potvrdi//
        ElementisPresent(potvrdi);
        clickonElement(potvrdi);

        //click pop up 2//
        ElementisPresent(popup2);
        clickonElement(popup2);

        //type needed information//
        ElementisPresent(name);
        type(name, firsname);
        type(lastnames,lastname);
        type(Address, address);
        type(City, city);
        type(Zipcode, zipcode);
        type(Cellphone, cellphone);
        clickonElement(okrug);
        clickonElement(Sumadijski);

        //scroll to sacuvaj and click it//
        scrolldown();
        clickonElement(savebutton);

        //check message//
        scrollup();
        Thread.sleep(3000);
        ElementisPresent(succesmesage);

        //logout//
        Hover(dropdownmenu);
        clickonElement(logbutton);
        clickonElement(loginagain);

        //login//
        type(Username, generatedEmail);
        clickonElement(nextstep);
        type(sifra3,password);
        ElementisPresent(regbutton);
        clickonElement(regbutton);

        //verify that it is correct account//
        ElementisPresent(message);

        //open mail//
        Protonmail();

        //delete email//
        clickonElement(email2);
        clickonElement(trashcan);
    }
}