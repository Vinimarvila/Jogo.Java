public class Guerreiro extends Personagem implements Curavel {
    public Guerreiro(String nome) {
        super(100, 20, nome);
    }

    @Override
    public void atacar(Personagem p) {
        System.out.println(getNome() + " ataca " + p.getNome() + " causando " + getForca() + " de dano.");
        p.receberDano(getForca());
    }

    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(20) + 10; // Valor de cura entre 10 e 30
        setVida(getVida() + cura);
        System.out.println(getNome() + " curou " + cura + " pontos de vida.");
    }
}
