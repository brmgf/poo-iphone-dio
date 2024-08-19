package org.brmgf;

import org.brmgf.implementacoes.IPod;
import org.brmgf.implementacoes.Safari;
import org.brmgf.interfaces.NavegadorInternet;
import org.brmgf.interfaces.ReprodutorMusical;

public class AparelhoTelefonico {

    private NavegadorInternet navegadorInternet;
    private ReprodutorMusical reprodutorMusical;

    public AparelhoTelefonico() {
        this.navegadorInternet = new Safari();
        this.reprodutorMusical = new IPod();
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }
}
