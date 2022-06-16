package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MobilizPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;


public class MobilizStepdefinition {

     MobilizPage mobilizPage=new MobilizPage();
     Actions actions=new Actions(Driver.getDriver());

     @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Given("anasayfaya gittigini dogrular")
    public void anasayfaya_gittigini_dogrular() {

         Driver.waitAndClick(mobilizPage.cerezButonu);

       String expectedUrl =  "https://mobiliz.com.tr/";
       String actualUrl= Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        Assert.assertEquals("gercek url ile beklenen url uyusmuyor" ,expectedUrl,actualUrl);

     }

     @Given("is ortaklari buttonuna tiklar")
    public void is_ortaklari_buttonuna_tiklar() {

        Driver.wait(3);
       actions.moveToElement(mobilizPage.isOrtaklari).perform();

    }

    @Given("Motorist buttonuna tiklar")
    public void motorist_buttonuna_tiklar() {
        Driver.wait(3);
       Driver.waitAndClick(mobilizPage.Motorist);


    }
    @Given("Motorist sayfasina gittigini  dogrular")
    public void motorist_sayfasina_gittigini_dogrular() {

         Driver.wait(2);
         Assert.assertTrue(mobilizPage.motoristYaziElementi.isDisplayed());

    }

    @Given("Mobilize tiklar")
    public void mobilize_tiklar() {

          Driver.wait(4);
        actions.moveToElement(mobilizPage.mobiliz).perform();


    }
    @Given("Kampanyanlara tiklar")
    public void kampanyanlara_tiklar() {

        Driver.waitAndClick(mobilizPage.kampanyalar);

    }
    @Given("Kampanyalar sayfasina gittigini dogrular")
    public void kampanyalar_sayfasina_gittigini_dogrular() throws IOException {

         Driver.wait(2);
         String kampanyalarSayfasi="https://mobiliz.com.tr/kampanyalar";
         String expectedKampanyalar=Driver.getDriver().getCurrentUrl();
        System.out.println("expectedKampanyalar = " + expectedKampanyalar);

        ReusableMethods.getScreenshot("KAMPANYALAR LiSTESİ");

    }
    @Given("Kampanyalar bolumundeki varolan kampanyalari dogrular")
    public void kampanyalar_bolumundeki_varolan_kampanyalari_dogrular() {

         Driver.wait(2);

         Assert.assertTrue(mobilizPage.kayitOlShellKampanyasi.isDisplayed());
         Assert.assertTrue(mobilizPage.tirportKampanyasi.isDisplayed());
         Assert.assertTrue(mobilizPage.surucuVerimlilikKampanyasi.isDisplayed());

    }

    @Given("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

       Driver.getDriver().quit();

    }

}
