package stepdefinitions;

import Pages.BeamPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.runtime.Runtime;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class BeamStepdefinitions {
    BeamPage beamPage=new BeamPage();

    @Given("Siteye {string} adresi ile giris yapilir.")
    public void siteye_adresi_ile_giris_yapilir(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Sirket adi BİMSER ACADEMY secilir.")
    public void sirket_adi_bimser_academy_secilir() {
        beamPage.sirketAdi.click();
        ReusableMethods.bekle(5);
        beamPage.bimserAcedemy.click();
        ReusableMethods.bekle(2);
    }
    @Given("Kullanici adi alanina gecerli kullanici {string} girilir.")
    public void kullanici_adi_alanina_gecerli_kullanici_ismi_girilir(String isim) {
        beamPage.kullaniciAdi.click();
        Actions actions=new Actions(Driver.getDriver());
        actions
                .click(beamPage.kullaniciAdi)
                .sendKeys(ConfigReader.getProperty(isim))
                .perform();
    }
    @Then("Sifre alanina gecerli {string} girilir.")
    public void sifre_alanina_gecerli_sifre_girilir(String sifre) {

        Actions actions=new Actions(Driver.getDriver());
        actions
                .click(beamPage.sifre)
                .sendKeys(ConfigReader.getProperty(sifre))
                .perform();

    }
    @Then("Sisteme dahil olmak icin giris butonuna tiklanir.")
    public void sisteme_dahil_olmak_icin_giris_butonuna_tiklanir() {
        beamPage.giris01.click();

    }
    @Then("Devam tusuna basilir.")
    public void devam_tusuna_basilir() {
        beamPage.devam.click();

    }
    @Then("Beam Dashboard sayfasinda oldugu test edilir.")
    public void beam_dashboard_sayfasinda_oldugu_test_edilir() {

        String expectedUrl = "http://demobeam.bimser.com/ACADEMY/default.aspx";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
    @Then("Sirket ismi olarak TurkBilisim \\(o.kacar) secilir.")
    public void sirket_ismi_olarak_turk_bilisim_o_kacar_secilir() {
        beamPage.sirketAdi.click();
        beamPage.turkBilisim.click();
    }
    @Then("Kullanici adi alanina gecersiz kullanici {string} girilir.")
    public void kullanici_adi_alanina_gecersiz_kullanici_ismi_girilir(String ismi) {
        beamPage.kullaniciAdi.click();
        Actions actions=new Actions(Driver.getDriver());
        actions
                .click(beamPage.kullaniciAdi)
                .sendKeys(ConfigReader.getProperty(ismi))
                .perform();
    }
    @Then("Mesaj uyarisi kontrolu yapilir. Mesaj uyarisi yazdilir.")
    public void mesaj_uyarisi_kontrolu_yapilir_mesaj_uyarisi_yazdilir() {
        Assert.assertTrue(beamPage.message.isDisplayed());
        System.out.println(beamPage.message.getText());
    }
    @Then("Sifre alanina gecersiz {string} girilir.")
    public void sifre_alanina_gecersiz_girilir(String yanlisSifre) {
        Actions actions=new Actions(Driver.getDriver());
        actions
                .click(beamPage.sifre)
                .sendKeys(ConfigReader.getProperty(yanlisSifre))
                .perform();
    }
    @Then("Menu alanina tiklanir.")
    public void menu_alanina_tiklanir() {
        beamPage.menu.click();
    }
    @Then("Sistem alanina tiklanir.")
    public void sistem_alanina_tiklanir() {
        beamPage.sistem.click();
    }
    @Then("Ortak tanimlar alanina tiklanir.")
    public void ortak_tanimlar_alanina_tiklanir() {
        beamPage.ortak.click();
    }
    @Then("Tatil gunleri alanina tiklanir.")
    public void tatil_gunleri_alanina_tiklanir() {
        beamPage.tatil.click();
    }
    @Then("Tatil gunleri ekraninda oldugun dogrulanir.")
    public void tatil_gunleri_ekraninda_oldugun_dogrulanir() {
       String actual=beamPage.tatiGunleri.getText();
       String expected="Tatil Günleri";

       Assert.assertTrue(expected.contains(actual));
    }
}
