package org.brmgf;

import org.brmgf.implementacoes.IPod;
import org.brmgf.implementacoes.Safari;
import org.brmgf.interfaces.NavegadorInternet;
import org.brmgf.interfaces.ReprodutorMusical;

public class Main {

    public static void main(String[] args) {

        NavegadorInternet safari = new Safari();
        ReprodutorMusical ipod = new IPod();
        AparelhoTelefonico iphone = new IPhone(safari, ipod);

        iphone.ligar("(11) 99999-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.getNavegadorInternet().exibirPaginas("https://www.dio.me/");
        iphone.getNavegadorInternet().adicionarNovaAba();
        iphone.getNavegadorInternet().atualizarPagina();

        iphone.getReprodutorMusical().selecionarMusica("Victor e Leo - Borboletas");
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();
    }
}