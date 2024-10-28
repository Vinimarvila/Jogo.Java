import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Criação dos personagens
        Guerreiro jogador = new Guerreiro("Jogador");
        Mago computador = new Mago("Computador");

        System.out.println("Bem-vindo ao jogo! Você é o Guerreiro e o Computador é o Mago.");
        
        // Loop do jogo
        while (jogador.getVida() > 0 && computador.getVida() > 0) {
            System.out.println("\nSua vida: " + jogador.getVida() + " | Vida do Computador: " + computador.getVida());
            System.out.println("Escolha sua ação: 1 - Atacar | 2 - Curar");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                jogador.atacar(computador);
            } else if (escolha == 2) {
                jogador.curar();
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            // Verifica se o computador foi derrotado
            if (computador.getVida() <= 0) {
                System.out.println("Você venceu!");
                break;
            }

            // Ação do computador
            System.out.println("\nTurno do Computador...");
            int acaoComputador = random.nextInt(2); // 0 para atacar, 1 para curar
            if (acaoComputador == 0) {
                computador.atacar(jogador);
            } else {
                computador.curar();
            }

            // Verifica se o jogador foi derrotado
            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado!");
            }
        }
        
        scanner.close();
    }
}
