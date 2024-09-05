public class Jogador {
    private String nome;
    private int pares;

    Jogador(){
        pares = 0;
    }
    
    public void marcarPonto (){
        pares++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }
}
