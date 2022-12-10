import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
        //utilizando as seguintes fórmulas: 
        //Para homens: (72.7*h) - 58
        //Para mulheres: (62.1*h) - 44.7
        Scanner teclado = new Scanner(System.in);

        // 1 - Ação do usuário - Digitar Altura
        System.out.print("Digite sua altura: ");
        double h = teclado.nextDouble();
        System.out.print("Informe seu sexo: (M) Masculino  (F) Feminino: ");
        char sexo = teclado.next().charAt(0);
        teclado.close();
        
        if (sexo == 'M') {
            double homem = (72.7 * h) - 58;
            System.out.println("Para o biotipo masculino com relação a altura seu peso ideal é: " + homem);
        }else if (sexo == 'F'){
            double mulher = (62.1 * h) - 44.7;
            System.out.println("Para o biotipo feminino com relação a altura seu peso ideal é: " + mulher);
        }else {
            System.out.println("Escolha Masculino ou Feminino");
        }


    }
}
