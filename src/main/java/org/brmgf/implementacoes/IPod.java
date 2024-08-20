package org.brmgf.implementacoes;

import org.brmgf.interfaces.ReprodutorMusical;

public class IPod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música em iPod");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada em iPod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionado \"" + musica + "\" para reproduzir em iPod");
    }
}
