import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Tabuleiro tabuleiro = new Tabuleiro();
        Revelado revelados = new Revelado();
        int modoDeJogo = Integer.parseInt(JOptionPane.showInputDialog("Deseja jogar:\n1.Em dupla\n2.Contra computador"));

        if (modoDeJogo == 1) {
            Jogador jogador1 = new Jogador(JOptionPane.showInputDialog("Qual o nome do Jogador 1?"));
            Jogador jogador2 = new Jogador(JOptionPane.showInputDialog("Qual o nome do Jogador 2?"));
        }
        else{
            Computador computador = new Computador();
        }

        int paresRevelados = 0;
        int rodadas = 1;
        int []linha = new int[2];
        int []coluna = new int[2];
        int []carta = new int[2];

        while (paresRevelados < 8) {
            for (int i = 0; i < 2; i++) {
                linha[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a linha desejada:\n0   x  x  x  x\n1   x  x  x  x\n2   x  x  x  x\n3   x  x  x  x"));
                coluna[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a coluna desejada:\n   0  1  2  3\n   x  x  x  x\n   x  x  x  x\n   x  x  x  x\n   x  x  x  x"));
                carta[i] = tabuleiro.tabuleiro[linha[i]][coluna[i]];

                
            }
            if (carta[0] == carta[1]) {
                paresRevelados++;
                revelados.tabuleiro[linha[0]][coluna[0]] = 1;
                revelados.tabuleiro[linha[1]][coluna[1]] = 1;

            }

        }



    }
}
