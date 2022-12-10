import java.util.Scanner;

public class exerc9 {

    public static void main(String[] args) {
        //Faça um Programa que peça a temperatura em graus Fahrenheit, 
        //transforme e mostre a temperatura em graus Celsius.
        //C = 5 * ((F-32) / 9).

        //Requisito 1: Solicite a temperatura em graus Fahrenheit
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temp_fahrenheit = teclado.nextDouble();
        teclado.close();

        //Requisito 2: Transforme em graus celsius
        double temp_celsius = 5 * ((temp_fahrenheit - 32) / 9);
        System.out.print("\nA temperatura em Fahrenheit " + temp_fahrenheit + " convertida para graus celsius é " + temp_celsius + "\n");
    }
}
