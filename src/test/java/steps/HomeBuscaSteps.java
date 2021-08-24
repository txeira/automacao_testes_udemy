package steps;

import core.Constantes;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;

public class HomeBuscaSteps {
    private HomePage home;

    public HomeBuscaSteps() {
        this.home = new HomePage();
       }

    @Dado("^que o usuario esteja na inicial$")
    public void queOUsuarioEstejaNaInicial() throws Throwable {
        home.Init();
    }

    @Quando("^clicar em categoria$")
    public void clicarEmCategoria() throws Throwable {
        home.SubMenuteste();
    }

    @Quando("^selecionar o cadegoria$")
    public void selecionarOCadegoria() throws Throwable {

    }

    @Entao("^sera direcionado para tela de cursos$")
    public void seraDirecionadoParaTelaDeCursos() throws Throwable {
        String heading = home.setHeading();
        Assert.assertEquals(Constantes.heading, heading);
        home.Finish();
    }
}
