package chess.pecas;

import boardgame.Tabuleiro;
import chess.Cor;
import chess.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }
    @Override
    public String toString(){
        return "T";
    }
}
