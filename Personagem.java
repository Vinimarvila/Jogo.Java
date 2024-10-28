import java.util.random;

public abstract class Personagem {
    private int vida;
    private int forca;
    private String nome;

    public Personagem(int vida, int forca, String nome) {
        this.vida = vida;
        this.forca = forca;
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public String getNome() {
        return nome;
    }
    public abstract void atacar(Personagem P);
    public void receberDano(int dano) {
        this.vida = dano;
        if (this.vida < 0 ) this.vida = 0;
    }
}