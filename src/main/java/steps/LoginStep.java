package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;


public class LoginStep {
    WebDriver driver;

    LoginPage loginPage;

    @Dado("que o usuario esta na tela do login {string}")
    public void queOUsuarioEstaNaTelaDoLogin(String url) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);
        loginPage = new LoginPage();
        Thread.sleep(2000);
    }

    @Quando("preencher os dados do usuário {string}")
    public void preencher_os_dados_do_usuário(String string) {
        driver.findElement(By.id(loginPage.email)).click();
        driver.findElement(By.id(loginPage.email)).sendKeys("vitor.goncalves102@gmail.com");

    }
    @E("preencher senha {string}")
    public void preencher_senha(String string) {
        driver.findElement(By.id(loginPage.senha)).click();
        driver.findElement(By.id(loginPage.senha)).sendKeys("jlsm123456789");
    }

    @E("clicar no botao Entrar")
    public void clicarNclicar_no_botao_entrar() {
        driver.findElement(By.id(loginPage.botaoEntrar_2)).click();
    }

    @Entao("permite acessar a home")
    public void permiteAcessarAHome() {
        driver.findElement(By.xpath(loginPage.telaHome)).isDisplayed();
    }
}