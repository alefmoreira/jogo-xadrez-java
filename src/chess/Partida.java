package chess;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import chess.pecas.Rei;
import chess.pecas.Torre;
import chess.XadrezPosicao;

public class Partida {

    private Tabuleiro tabuleiro;

    public Partida(){
        tabuleiro = new Tabuleiro(8,8);
        configInicial();
    }
    public PecaXadrez[][] getPecas (){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
               mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }
    private void lugarNovaPeca(char coluna, int linha, PecaXadrez pecaXadrez){
        tabuleiro.lugarPeca(pecaXadrez, new XadrezPosicao(coluna, linha).toPositon());
    }
    private void configInicial(){
        lugarNovaPeca('b', 5, new Torre(tabuleiro, Cor.BRANCO));

    }



}
