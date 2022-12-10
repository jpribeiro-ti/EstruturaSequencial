import java.util.Scanner;

public class exerc2 {
    //Faça um Programa que peça um número e
    //então mostre a mensagem O número informado foi [número].

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");        
        int numero = teclado.nextInt();
        teclado.close();
        System.out.println("\n\nO número digitado foi: "+ numero);
    }
}
