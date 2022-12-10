import java.util.Scanner;

public class exerc8 {
//Faça um Programa que pergunte quanto você ganha por hora e o número de 
//horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês

    public static void main(String[] args) {
        //Requisito 1: Pergunte quanto você ganha por hora

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        double sal_hora = teclado.nextDouble();

        //Requisito 2: Quantas horas trabalhada mo mês
        System.out.print("Quantas horas trabalhou? ");
        double hora_trab = teclado.nextDouble();
        teclado.close();

        //Requisito 3: Calcule e mostre o total do seu salário no referido mês
        double salario_mes = sal_hora * hora_trab;
        System.out.println("O salário mensal é: " + salario_mes);

    }
}
