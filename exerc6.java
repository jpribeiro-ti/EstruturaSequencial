import java.util.Scanner;

public class exerc6 {
    // Faça um Programa que peça o raio de um círculo,
    //calcule e mostre sua área.
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //Peça o raio do circulo

        System.out.print("Digite o Raio do Cícrulo: ");
        double raio = teclado.nextDouble();
        teclado.close();

        //Requisito 2: Calcular a área do círculo
        //Pi() * POTÊNCIA(c3:2)
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo de raio " + raio + " é igual a: " + area);


    }
    
}
