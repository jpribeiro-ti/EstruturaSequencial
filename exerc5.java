import java.util.Scanner;

public class exerc5 {
    //Faça um Programa que converta metros para centímetros.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a medida em metros: ");
        double metros = teclado.nextDouble();
        teclado.close();

        double cent = metros * 100;

        System.out.print("A medida convertida de metros para centímetro é: " + cent);
    }
    
    
}
