import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o 
INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
 */

public class exerc15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Perguntar quanto você ganha
        System.out.print("QUanto é o seu salário hora: ");
        double valorHora = teclado.nextDouble();

        //Calcular quantas horas vc trabalha no mês
        System.out.print("Quantas horas você trabalha no mês: ");
        double qtdHoras = teclado.nextDouble();

        teclado.close();

        //Calcular o salário Bruto
        double salarioBruto = valorHora * qtdHoras;

        //Calcular 8% para o INSS
        double INSS = salarioBruto * 0.08;

        //Calcule o desconto pago ao sindicato
        double sindicato = salarioBruto * 0.05;

        //Calcule o Imposto de renda
        double IRPF = salarioBruto * 0.11;

        //Calcule o total dos descontos
        double totalDescontos = INSS + sindicato + IRPF;

        //Calcule o salário líquido
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("IR (11%: R$ " + IRPF);
        System.out.println("INSS (8%): R$ " + INSS);
        System.out.println("Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
