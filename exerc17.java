import java.util.Scanner;

/*
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, 
 * que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

public class exerc17 {
    public static void main(String[] args) {
        
        double areaPintada, numeroLatas, precoTotal;
        
        //ação do usuário: area a ser pintada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a área a ser pintada: ");

        areaPintada = teclado.nextDouble();
        teclado.close();

        //Tarefa do programa: 
        //Calcular a quantidade de latas de tintas
        numeroLatas = Math.ceil( areaPintada / 54);
        //numeroTotalLatas = areaPintada / 54
        // calcular o preço total das tintas
        precoTotal = 80 * numeroLatas;
        // precoTotal = 80 * numeroTotalLatas


        //Resposta do programa: quantidade de latas e valor
        System.out.println("O total de latas é: " + numeroLatas);
        System.out.println("O valor total é: " + precoTotal);
    }
}
