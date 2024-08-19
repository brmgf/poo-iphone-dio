package org.brmgf;

public class Main {

    public static void main(String[] args) {

        AparelhoTelefonico iphone = new IPhone();

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