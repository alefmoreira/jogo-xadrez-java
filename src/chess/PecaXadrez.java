package chess;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaXadrez extends Peca {
    private Cor cor;
    private int contarMovimento;

    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

}
