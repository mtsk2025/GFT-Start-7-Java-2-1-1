import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Dados da Primeira Pessoa ---
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha restante após nextInt()

        // --- Dados da Segunda Pessoa ---
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        // Calcular a diferença absoluta para evitar resultados negativos
        int diferencaIdade = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");

        scanner.close();
    }
}
