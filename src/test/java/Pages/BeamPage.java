package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BeamPage {
    public BeamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@class='dxEditors_edtDropDown']")
    public WebElement sirketAdi;

    @FindBy(xpath = "//td[@id='cbCompany_DDD_L_LBI2T0']")
    public WebElement bimserAcedemy;

    @FindBy(xpath="(//div[@class='form-group'])[2]")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "(//div[@class='form-group'])[3]")
    public WebElement sifre;

    @FindBy(xpath = "//div[@id='xppcProcurationList_xbtnContinue_CD']")
    public WebElement devam;

    @FindBy(xpath = "(//span[contains(text(),'GİRİŞ')])[1]")
    public WebElement giris01;

    @FindBy(xpath = "//div[@class='dashboardHeader']")
    public WebElement dashboardElementi;

    @FindBy(xpath = "//input[@id='cbCompany_I']")
    public WebElement turkBilisim;

    @FindBy(xpath = "//span[@id='xmmMessage']")
    public WebElement message;

    @FindBy(xpath = "//button[@id='init-app-menu']")
    public WebElement menu;

    @FindBy(xpath = "(//i[@class='fa fa-angle-right menu-item-arrow'])[6]")
    public WebElement sistem;

    @FindBy(xpath = "(//i[@class='fa fa-angle-right menu-item-arrow'])[7]")
    public WebElement ortak;

    @FindBy(xpath = "//div[@class='BOYSIcon BOYSIcon-5631_32']")
    public WebElement tatil;

    @FindBy(xpath = "//div[@class='divRow']")
    public WebElement tatiGunleri;


}
