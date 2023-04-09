import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        double numero;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Informe um número:");

            numero = teclado.nextDouble();

            System.out.printf("O número informado foi: %.1f", numero);
        }

    }

}