import java.util.Scanner;
/*
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, 
 * que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */
public class exerc16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Requisito 1: Pedir tamanho em metros quadrados da área a ser pintada L x A
        //1 litro pinto 3 metros
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double areaPintar = teclado.nextDouble();
        teclado.close();

        //Calcular a quantidade de tinta
        double qtdTinta = areaPintar / 3;

        //Calcular a quantidade de latas
        double qtdLatas = Math.round((qtdTinta / 18) + 0.5);

        double valorGasto = qtdLatas * 80;
        
        System.out.println("Quantidad de tinta: " + qtdTinta);
        System.out.println("Quantidad de latas: " + qtdLatas);
        System.out.println("O valor gasto será de: " + valorGasto);

    }
}
