import java.util.Scanner;

public class exerc7 {

    public static void main(String[] args) {
        //Faça um Programa que calcule a área de um quadrado, em seguida mostre 
        //o dobro desta área para o usuário.

        //Requisito 1: Pedir a medida do lado do quadrado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        double lado = teclado.nextDouble();
        teclado.close();

        //Requisito 2: Calcular a área do quadrado
        double area = lado * lado;

        //Requisito 3: Calular e mostrar o dobro da área do quadrado
        double dobro = area * 2;

        System.out.print("\n\nO dobro da área do quadrado é: " + dobro);
    }
    
}
