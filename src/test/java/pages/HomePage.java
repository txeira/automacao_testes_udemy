package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import support.Web;

import java.util.concurrent.TimeUnit;


public class HomePage extends Web {
    private By menuCategorias = By.xpath("//span[.='Categorias']");
    private By subMenuDesenvolvimento = By.xpath("//div[@class='js-browse-nav-level-one browse-nav--nav--1WzbY']//li[1]//div[@class='udlite-block-list-item-content']");
    private By subMenuteste = By.xpath("//div[.='Teste de software']");
    private By setHeading = By.xpath("//h1[@class='udlite-heading-serif-xxl category--heading-primary--2uO95']");


    
    public void MenuCategorias() {
        navegador.findElement(menuCategorias).click();
    }
    public void SubMenuDesenvolvimento() {
        navegador.findElement(menuCategorias).click();
        navegador.findElement(subMenuDesenvolvimento).click();
    }
    public void SubMenuteste() {

        Actions action = new Actions(navegador);

        navegador.findElement(menuCategorias).click();
        navegador.findElement(subMenuDesenvolvimento);
        action.moveToElement(navegador.findElement(subMenuDesenvolvimento)).build().perform();
        navegador.findElement(subMenuteste).click();
    }
    public String setHeading() {
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador.findElement(setHeading).getAttribute("innerText");
    }

}
