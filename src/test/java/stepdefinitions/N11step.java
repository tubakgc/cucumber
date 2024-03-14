package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class N11step {

    @Given("Kullanıcı Anasayfaya  gider")
    public void kullanıcıAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("urlN11"));
    }

    @When("Ana sayfanın yüklendiğini doğrular")
    public void anaSayfanınYuklendiginiDogrular() {

    }

    @And("Kullanıcı ana sayfa giriş butınunu bulur ve tıklar")
    public void kullanıcıAnaSayfaGirisButınunuBulurVeTıklar() {
    }

    @And("Giriş sayfasının yüklendiği doğrulanır.")
    public void girisSayfasınınYuklendigiDogrulanır() {
    }

    @And("Kullanıcı giriş sayfasında geçerli bir kullanıcı adı  girer.")
    public void kullanıcıGirisSayfasındaGecerliBirKullanıcıAdıGirer() {
    }

    @And("Kullanıcı giriş sayfasında geçerli bir şifre girer.")
    public void kullanıcıGirisSayfasındaGecerliBirSifreGirer() {
    }

    @And("Kullanıcı {string} butonuna tıklar.")
    public void kullanıcıButonunaTıklar(String arg0) {
    }

    @And("Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır.")
    public void kullanıcınınHesabınaBasarıylaGirisYapıldıgıDogrulanır() {
    }
}
