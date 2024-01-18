package TestCase04;


import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class TestCase4 extends Metode {

    public By mail = By.id("email");
    public By sifra1 = By.id("password_first");
    public By sifra2 = By.id("password_second");
    public By poruka = By.xpath("//p[@class='uk-alert uk-alert-warning']");
    public By oglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By registracija = By.xpath("//a[@class='uk-width-1-1 uk-button button-register uk-button-large button-box-shadow-remove uk-text-large']");
    public By prihvatamcheckbox = By.xpath("//input[@id='tos']");
    public By prodajacheckbox = By.xpath("//input[@id='easySaleConsent']");
    public By kupovinacheckbox = By.xpath("//input[@id='easyBuyConsent']");
    public By regbutton = By.xpath("//button[@name='login']");
    public By protonmail = By.xpath("//input[@id='username']");
    public By protonpass = By.xpath("//input[@id='password']");
    public By login = By.xpath("//button[@class='button w-full button-large button-solid-norm mt-6']");

    public By emailtitle = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By linkmail = By.xpath("//iframe[@class='w-full']");
    public By clickonit = By.xpath("//button[@class='button button-medium button-solid-norm']");
    public By interestedinbuying =  By.xpath("//label//input[@id='interestedInBuying']");
    public By interestedinselling = By.xpath("//label//input[@id='interestedInSelling']");
    public By interestedinreviweing = By.xpath("//label//input[@id='interestedInReviewingOffer']");
    public By potvrdi = By.xpath("//button[@name='submit_registration_survey']");
    public By popup2 = By.xpath("//button[contains(text(),'U redu')]");
    public By email2 = By.xpath("//span[@title='Aktivirajte Vaš nalog']");
    public By trashcan = By.xpath("//div[@class='flex items-center toolbar-inner flex-nowrap gap-2']//button[@data-testid='toolbar:movetotrash']");
    public By message = By.xpath("//span[@class='ym-hide-content']");
    public By succesmesage = By.xpath("//div[@class='uk-alert uk-alert-success']");
    public By logbutton = By.xpath("//li//a[@class='js-logout-link signin_menu_element']");
    public By loginagain = By.xpath("//a[@class='uk-float-left js_ga-event signin_menu_element']");
    public By sifra3 = By.xpath("//input[@id='password_header']");
    public By savebutton = By.xpath("//button[@id='submit']");
    public By name = By.xpath("//input[@name='first_name']");
    public By lastnames = By.xpath("//input[@name='last_name']");
    public By Address = By.xpath("//input[@name='address']");
    public By City = By.xpath("//input[@name='city']");
    public By Zipcode = By.xpath("//input[@name='zip_code']");
    public By Cellphone = By.xpath("//input[@id='cellphone']");
    public By Username = By.xpath("//input[@id='username_header']");
    public By dropdownmenu = By.xpath("//i[@class='position-absolute uk-icon-caret-down']");
    public By okrug = By.xpath("//p[@title=' Odaberite okrug']");
    public By Sumadijski = By.xpath("//label[contains(.,'Šumadijski')]");
    public By nextstep = By.id("next-step");

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
        Thread.sleep(5000);
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
        Thread.sleep(11000);
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
