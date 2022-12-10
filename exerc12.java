import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args){
        //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a 
        //seguinte fórmula: (72.7*altura) - 58
        Scanner teclado = new Scanner(System.in);

        // 1. Ação do usuário: entrada altura
        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        teclado.close();

        double resultado = (72.7 * altura) - 58;

        System.out.print("Seu peso ideal é: " + resultado);

    }
}
