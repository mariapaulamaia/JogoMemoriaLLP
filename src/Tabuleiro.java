import java.util.Random;
public class Tabuleiro {
    int [][]tabuleiro = new int[4][4];


    Tabuleiro(){
        Random linhaRandom = new Random();
        Random colunaRandom = new Random();
        int linha;
        int coluna;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = 0;

            }
        }


        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                do{
                    linha = linhaRandom.nextInt(4);
                    coluna = colunaRandom.nextInt(4);
                } while(tabuleiro[linha][coluna] != 0);
                tabuleiro[linha][coluna] = i;

            }
            
            
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j]+" ");

            }
            System.out.print("\n");
        }
        
    }
    
    
    

    
}