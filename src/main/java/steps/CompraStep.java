package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CompraPage;
import org.openqa.selenium.chrome.ChromeOptions;



public class CompraStep {
    WebDriver driver;

    CompraPage compraPage;
    @Dado("que estou na tela inicial {string}")
    public void que_estou_na_tela_inicial(String url) throws InterruptedException {
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-notifications");
        driver = new ChromeDriver(chrome_options);
        driver.get(url);
        driver.manage().window().maximize();
        compraPage = new CompraPage();
        Thread.sleep(3000);
    }
    @Quando("digitar {string}")
    public void digitar_tv(String tv) throws InterruptedException {
        driver.findElement(By.id(compraPage.pesquisa)).click();
        driver.findElement(By.id(compraPage.pesquisa)).sendKeys(tv);
    }
    @E("Clicar botao Enter")
    public void clicar_botao_enter() {
        driver.findElement(By.id(compraPage.pesquisa)).sendKeys(Keys.ENTER);

    }
    @Entao("apresenta os dados da pesquisa")
    public void apresenta_os_dados_da_pesquisa() {
        driver.findElement(By.xpath(compraPage.telaInicial)).isDisplayed();
    }
}