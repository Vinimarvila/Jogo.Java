public class Mago extends Personagem implements Curavel {
    public Mago(String nome) {
        super(80, 30, nome);
    }

    @Override
    public void atacar(Personagem p) {
        System.out.println(getNome() + " lança um feitiço em " + p.getNome() + " causando " + getForca() + " de dano.");
        p.receberDano(getForca());
    }

    @Override
    public void curar() {
        Random random = new Random();
        int cura = random.nextInt(25) + 5; // Valor de cura entre 5 e 30
        setVida(getVida() + cura);
        System.out.println(getNome() + " se curou em " + cura + " pontos de vida.");
    }
}
