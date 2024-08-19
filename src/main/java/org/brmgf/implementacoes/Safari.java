package org.brmgf.implementacoes;

import org.brmgf.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPaginas(String url) {
        System.out.println("Exibindo " + url + " em Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba em Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página em Safari");
    }
}
