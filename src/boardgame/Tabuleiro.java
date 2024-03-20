package boardgame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas <1){
            throw new TabuleiroException("Erro ao criar o tabuleiro: é necessario que haja pelo menos 1 linha e 1 coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }
    public int getColunas() {
        return colunas;
    }
    public Peca peca(int linha, int coluna){
        if(!posicaoExistente(linha,coluna)){
            throw new TabuleiroException("Posicao não existe nesse tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao){
        if(!posicaoExistente(posicao)){
            throw new TabuleiroException("Posicao não existe nesse tabuleiro ");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void lugarPeca(Peca peca, Posicao posicao){ //colocar peca em uma posição
        if (pecaNaPosicao(posicao)){
            throw new TabuleiroException("Posição Invalida: ja existe uma peça nessa posição." + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    private boolean posicaoExistente(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >=0 && coluna < colunas;
    }
    public boolean posicaoExistente(Posicao posicao){// verifica se a posicao no tabuleiro existe
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }
    public boolean pecaNaPosicao(Posicao posicao){//verifica se existe uma peça na posicao
        if(!posicaoExistente(posicao)){//excessão caso exista
            throw new TabuleiroException("Posicao não existe nesse tabuleiro ");
        }
        return peca(posicao) != null;
    }
}
