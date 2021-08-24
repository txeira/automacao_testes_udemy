package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriverWait wait;
    protected WebDriver navegador;
    protected Actions actions;
    public BasePage(WebDriver navegador)
    {
        navegador = navegador;
        actions = new Actions(navegador);
        wait = new WebDriverWait(navegador, 5000);
    }
}
