package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MobilizPage {

    public MobilizPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "(//p[@class='chakra-text css-jcgfqd'])[3]")
    public WebElement isOrtaklari;

    @FindBy(xpath = "(//a[text()='Motorist - Motosiklet Sürücüsüne Özel Yeni Nesil Uygulama'])[3]")
    public WebElement Motorist;

     @FindBy(xpath = "//img[@class='chakra-image css-1mmtv2s']")
     public WebElement motoristYaziElementi;

     @FindBy(xpath = "(//div[@class='chakra-stack css-11sp92w'])[3]")
     public WebElement isOrtaklariDropDown;

    @FindBy(xpath = "//button[@aria-label='Accept cookies']")
     public WebElement  cerezButonu;

    @FindBy(xpath = "(//p[text()='Mobiliz'])[1]")
    public WebElement mobiliz;

    @FindBy(xpath = "(//a[text()='Kampanyalar'])[4]")
    public WebElement kampanyalar;

    @FindBy(xpath = "(//a[@href='/kampanyalar/kayit-ol-shell'])[2]")
    public WebElement kayitOlShellKampanyasi;

    @FindBy(xpath = "//h2[text()='Tırport Kampanya']")
    public WebElement tirportKampanyasi;

    @FindBy(xpath = "(//a[@href='/kampanyalar/surucu-verimlilik'])[2]")
    public WebElement surucuVerimlilikKampanyasi;









}
