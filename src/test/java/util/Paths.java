package util;

import org.openqa.selenium.By;

public class Paths {

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

    public By testlink = By.xpath("//a:nth-child[5]");
    public By linkmail = By.xpath("//div[@class='message-iframe p-0']//iframe[@class='w-full']");
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


    public By nezelim = By.xpath("//button[@id='btn_poll_no']");


    public By Cellphone = By.xpath("//input[@id='cellphone']");
    public By Username = By.xpath("//input[@id='username_header']");
    public By dropdownmenu = By.xpath("//i[@class='position-absolute uk-icon-caret-down']");
    public By postavioglas = By.xpath("//a[@class='top-menu-submit-classified js_ga-event']");
    public By okrug = By.xpath("//p[@title=' Odaberite okrug']");
    public By Sumadijski = By.xpath("//label[contains(.,'Šumadijski')]");
    public By nextstep = By.id("next-step");


    public By searchTitle = By.xpath("//h1[@class='searchTitle']");




    //treca
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
    public By mailentrance = By.xpath("//button[@data-testid='explore-mail']");





    
    public By selectdoors = By.xpath("//label[contains(.,'4/5 vrata')]");
    public By searchbutton = By.id("submit_1");
    public By detailed = By.name("isDetailed");
    public By korisnik = By.id("user-name");
    public By sifra = By.id("password");
    public By backpack = By.xpath("//div[@class='inventory_item_label']//a[@id='item_4_title_link']//div[contains(.,'Sauce Labs Backpack')]");
    public By backpacktitle = By.xpath("//div[@class='inventory_details_desc_container']//div[contains(.,'Sauce Labs Backpack')]");
    public By backpackdescription = By.xpath("//div[@class='inventory_details_desc large_size']");
    public By backpackprice = By.xpath("//div[@class='inventory_details_price']");
    public By addbackpack = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    public By backbutton = By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']");
    public By addjacket = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']");
    public By shoppingcart = By.xpath("//a[@class='shopping_cart_link']");
    public By checkout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
    public By ime = By.id("first-name");
    public By prezime = By.id("last-name");
    public By postanskikod = By.id("postal-code");
    public By nastavi = By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']");
    public By finish = By.xpath("//button[@class='btn btn_action btn_medium cart_button']");
    public By messages = By.xpath("//h2[@class='complete-header']");
    public By openmenu = By.id("react-burger-menu-btn");
    public By loggout = By.id("logout_sidebar_link");
    public By loggin = By.id("login-button");
    public By saucekorisnik = By.id("user-name");
    public By saucesifra = By.id("password");
    public By login1 = By.id("login-button");
    public By product = By.xpath("//span[@class='title']");
    public By shoppingcart1 = By.xpath("//a[@class='shopping_cart_link']");
    public By twitter = By.xpath("//li[@class='social_twitter']");
    public By facebook = By.xpath("//li[@class='social_facebook']");
    public By linkedin = By.xpath("//li[@class='social_linkedin']");
    public By burgermenu = By.id("react-burger-menu-btn");
    public By logout = By.id("logout_sidebar_link");
    public By popupfromhell = By.xpath("//button[@class='paOrangeButtonPrimary button-box-shadow-remove']");

}
