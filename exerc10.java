import java.util.Scanner;

public class exerc10 {
    //Faça um Programa que peça a temperatura em graus Celsius,
    //transforme e mostre em graus Fahrenheit.
    //F = (°C x 1,8) + 32

    public static void main(String[] args) {
        //Requisito 1: peça a temperatura em raus celsius
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus celsius: ");
        double temp_celsius = teclado.nextDouble();
        teclado.close();

        //Requisito 2: Converta para graus Fahrenheit
        double temp_fahrenheit = (temp_celsius * 1.8) + 32;
        System.out.print("\nA temperatura em graus celsius " + temp_celsius + " convertida para graus fahrenheit é: " + temp_fahrenheit);
    }
}
