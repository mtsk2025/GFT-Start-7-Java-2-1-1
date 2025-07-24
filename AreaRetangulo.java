import java.util.Scanner;
import java.time.Year; // Para obter o ano atual

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
