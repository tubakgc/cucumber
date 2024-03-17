package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class N11step {
    /*
    moveToElement (Webelement element) belirtilen webelementin üstüne gelmek (hover) için
    click()belirtilen elemente tıklemek
    doubleClick() çift tıklamak
    dradAndDrop (Webelemet source Webelemet target) bir element, sürükleyip bırakmak için
     */

    N11page n11page = new N11page();
    Actions actions = new Actions(getDriver());


    @Given("Kullanıcı Anasayfaya  gider")
    public void kullanıcıAnasayfayaGider() {
        ReusableMethods.bekle(2);
        //n11page.btnCookie.click(); HATAAAA!!!!!!
        //getDriver().get(ConfigReader.getProperty("urlN11"));

        n11page.adressOk.click();

    }

    @When("Ana sayfanın yüklendiğini doğrular")
    public void anaSayfanınYuklendiginiDogrular() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(expectedTitle, actualTitle);


    }

    @And("Kullanıcı ana sayfa giriş butınunu bulur ve tıklar")
    public void kullanıcıAnaSayfaGirisButınunuBulurVeTıklar() {
        n11page.btnGirisYap.click();

    }

    @And("Giriş sayfasının yüklendiği doğrulanır.")
    public void girisSayfasınınYuklendigiDogrulanır() {
        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        String expectedUrl = "https://www.n11.com/giris-yap";
        assertEquals(actualUrl, expectedUrl);
    }

    @And("Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.")
    public void kullanıcıGirisSayfasındaGecerliBirKullanıcıAdıGirer() {
        n11page.btnemail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı giriş sayfasında geçerli bir şifre girer.")
    public void kullanıcıGirisSayfasındaGecerliBirSifreGirer() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @And("Kullanıcı {string} butonuna tıklar.")
    public void kullanıcıButonunaTıklar(String arg0) {
        ReusableMethods.bekle(3);
        n11page.LoginButton.click();
    }

    @And("Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır.")
    public void kullanıcınınHesabınaBasarıylaGirisYapıldıgıDogrulanır() {
        n11page.bildirim.click();
        actions.moveToElement(n11page.bildirim).perform();
    }

    @When("Kullanıcı arama kutusuna {string} yazar")
    public void kullanıcıAramaKutusunaYazar(String arg0) {
        n11page.searchBar.sendKeys("kablosuz kulaklık");
    }

    @And("kullanıcı yazılan ifadeyi arama yapar")
    public void kullanıcıYazılanIfadeyiAramaYapar() {
        n11page.searchButton.click();
    }

    @And("Açılan sayfada {int} yıldız üzeri olan ürünleri seçer")
    public void acılanSayfadaYıldızUzeriOlanUrunleriSecer(int arg0) {
        ReusableMethods.bekle(3);

        // JavaScriptExecutor oluştur
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Öğeye odaklan
        js.executeScript("arguments[0].scrollIntoView(true);", n11page.stars);

        // Sayfayı sağa doğru 500 piksel kaydır
        // js.executeScript("window.scrollBy(0, 500)");
        //n11page.price.click();
    }

    @And("Kullanıcı arama sonuçları arasından istediği bir kablosuz kulaklığı seçer.")
    public void kullanıcıAramaSonuclarıArasındanIstedigiBirKablosuzKulaklıgıSecer() {
        //ReusableMethods.bekle(4);
        n11page.earphones.click();
    }

    @And("Kullanıcı ürün detay sayfasında {string} butonuna tıklar.")
    public void kullanıcıUrunDetaySayfasındaButonunaTıklar(String arg0) {
        n11page.basketButton.click();
    }

    @And("Kullanıcı sepetteki ürünleri kontrol eder.")
    public void kullanıcıSepettekiUrunleriKontrolEder() {
        n11page.basketWhite.click();
    }

    @And("Kullanıcı satın al butonuna tıklar.")
    public void kullanıcıSatınAlButonunaTıklar() {
        n11page.moneyPay.click();
    }

    @And("Ödeme sayfasının açıldığını kontrol eder")
    public void odemeSayfasınınAcıldıgınıKontrolEder() {
        ReusableMethods.bekle(5);
        String pageTitle = driver.getTitle();
        String payTitle = "Ödeme Onayı - n11.com";
        assertEquals(pageTitle, payTitle);
    }

    //ikinci kısım
    @And("Kullanıcı ödeme sayfasından sepetim kısmına geri döner")
    public void kullanıcıOdemeSayfasındanSepetimKısmınaGeriDoner() {
        driver.navigate().back();
    }

    @And("Kullanıcı sepetteki ürünü siler")
    public void kullanıcıSepettekiUrunuSiler() {

        //sayfanın yarısına gidilir.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
        js.executeScript("window.scrollBy(298, 364)");
        //js.executeScript("arguments[0].scrollIntoView(true);", n11page.delete);
        ReusableMethods.bekle(3);
        n11page.delete.click();
        ReusableMethods.bekle(5);
        n11page.deleteTwo.click();
    }

    @And("sepetin boş olduğu doğrulanır")
    public void sepetinBosOlduguDogrulanır() {
        String basketTitle = driver.getTitle();
        String nullTitle = "Sepetim - n11.com";
        assertEquals(nullTitle, basketTitle);
    }

    @And("kullanıcı hesaptan çıkış yapar.")
    public void kullanıcıHesaptanCıkısYapar() {
        ReusableMethods.bekle(2);
        actions.moveToElement(n11page.users).perform();
        ReusableMethods.bekle(2);

        n11page.theEnd.click();

    }


}
