public class Computador {
    int [][]memoria = new int[4][4];
    private int pares;
    
    Computador(){
        pares = 0;
        for (int i = 0; i < memoria.length; i++) {
            for (int j = 0; j < memoria.length; j++) {
                memoria[i][j] = 0;

            }
        }
    }

    public void marcarPonto(){
        pares++;
    }

    public int[][] getMemoria() {
        return memoria;
    }

    public void setMemoria(int[][] memoria) {
        this.memoria = memoria;
    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }
}
