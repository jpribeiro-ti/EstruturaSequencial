import java.util.Scanner;

public class exerc11 {
    //Faça um Programa que peça 2 números inteiros e um número real. 
    //Calcule e mostre:
    //o produto do dobro do primeiro com metade do segundo .
    //a soma do triplo do primeiro com o terceiro.
    //o terceiro elevado ao cubo.

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //Requisito 1: Peça 2 número inteiros e 1 número real
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        double num3 = teclado.nextDouble();
        teclado.close();

        //Requisito 2: calcule o dobro do primeiro
        int dobro_num1 = num1 * 2;

        //Requisito 3: calcule metade do segundo
        double metade_segundo = num2 / 2;

        //Requisito 4: produto dos req2 e req 3
        double produto = dobro_num1 * metade_segundo;

        //Requisito 5: o triplo do num1
        double triplo = num1 * 3;

        //Requisito 6: Soma dos req 5 mais o terceiro número
        double soma = triplo + num3;

        //Requisito 7: Terceiro número elevado ao cubo
        double terceiro_numero = Math.pow(num3, 3);

        System.out.println("O primeiro número é: " + num1);
        System.out.println("O segundo número é: " + num2);
        System.out.println("O terceiro número é: " + num3);
        System.out.println("O dobro do primeiro número é: " + dobro_num1);
        System.out.println("A metade do segundo número é: " + metade_segundo);
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("O triplo do primeiro número é: " + triplo);
        System.out.println("A soma do triplo do primeiro número com o terceiro é: " + soma);
        System.out.println("O terceiro número elevado ao cubo triplo do primeiro número é: " + terceiro_numero);
        
        

    }
    
}
