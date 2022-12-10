import java.util.Scanner;

public class exerc3 {
    //Faça um Programa que peça dois números e imprima a soma.

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digita o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        teclado.close();
        int soma = num1 + num2;
        System.out.println("\n\nA soma dos números é: " + soma);

    }
}
