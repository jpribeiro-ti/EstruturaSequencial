import java.util.Scanner;

import javax.xml.transform.Source;

public class exerc14 {
    /*
    João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
    Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
    (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a 
    variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
    e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular quantidade de kg de peixes diários: \n\n");
        // 1 - Ação do usuário: Digitar a o peso de peixes
        System.out.print("Qual o peso de peixes o Pescador trouxe? ");
        int peso = teclado.nextInt();
        teclado.close();

        // 2 - Tarefa do computador: Se trouxer acima de 50 kg, pagar multa de 4,00 por kg a mais

        // 2.1 - Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar
        if (peso > 50) {
            int excesso = peso - 50;
            int multa = excesso * 4;
            System.out.print("O pescador João trouxe " + excesso + "kg, a mais do que o permitido.\n");
            System.out.print("O valor que ele deverá recolher de multa é: R$ " + multa);
        }else{
            System.out.print("O peso total é de: " + peso + " kg");
        }
        
    }
}
