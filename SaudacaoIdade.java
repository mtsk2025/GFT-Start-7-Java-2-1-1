import java.util.Scanner;
import java.time.Year; // Para obter o ano atual

public class SaudacaoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento (ex: 1990): ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual dinamicamente
        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá '" + nome + "' você tem '" + idade + "' anos");

        scanner.close(); // Fechar o scanner é uma boa prática
    }
}
