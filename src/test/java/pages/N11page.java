package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class N11page {

    public N11page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Giriş Yap")
    public WebElement btnGirisYap;

    @FindBy(xpath = "//input[@id=\'email']")
    public WebElement btnemail;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement btnPassword;

    @FindBy(xpath = "//div[@id=\"loginButton\"]")
    public WebElement LoginButton;

    @FindBy(className = "myNotHolder")
    public WebElement bildirim;

    @FindBy(xpath = "//input[@id=\"searchData\"]")
    public WebElement searchBar;

    @FindBy(xpath = "//span[@class=\"iconsSearch\"]")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[@data-id])[3]")
    public WebElement price;
    //burda 4 yıldız üstü almak istedim sorun yaşadım.butonu seçemiyorum

    @FindBy(xpath = "(//div[@class='rate customRadio  '])[2]")
    public WebElement stars;
    @FindBy(xpath = "(//div[@class=\"pro\"])[4]")
    public WebElement earphones;

    @FindBy(className = "product-add-cart")
    public WebElement basketButton;

    @FindBy(className = "iconsBasketWhite")
    public WebElement basketWhite;

    @FindBy(id = "js-goToPaymentBtn")
    public WebElement moneyPay;

   // @FindBy(xpath = "//span[@title=\"Sil\"]")
   @FindBy(xpath = "//span[@title='Sil' and contains(text(),'Sil')]")
    public WebElement delete;

    @FindBy(xpath = "//span[@id=\"deleteBtnDFLB\"]")
    public WebElement deleteTwo;


    @FindBy(xpath = "//a[@class=\"user\"]")

    public WebElement users;
    @FindBy(xpath = "//a[@class=\"logoutBtn\"]")
    public WebElement theEnd;


}
