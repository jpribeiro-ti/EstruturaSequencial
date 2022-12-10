import java.util.Scanner;

public class exerc4 {
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {
                    
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite nota do 1 bimestre: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite nota do 2 bimestre: ");
        double n2 = teclado.nextDouble();
        System.out.print("Digite nota do 3 bimestre: ");
        double n3 = teclado.nextDouble();
        System.out.print("Digite nota do 4 bimestre: ");
        double n4 = teclado.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.print("\nA média é: " + media);



    }
    
}
