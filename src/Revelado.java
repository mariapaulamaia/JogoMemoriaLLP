public class Revelado extends Tabuleiro {
    Revelado(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = 0;

            }
        }
    }
}
