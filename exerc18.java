  // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade
  //de um link de Internet
  // (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class exerc18 {
  public static void main(String[] args) {
    double tempoSegundos, tempoMinutos;
    
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite o tamanho do arquivo: ");
      double tamArquivo = teclado.nextDouble();

      System.out.print("Digite a velocidade da internet: ");
      double velInternet = teclado.nextDouble();
      teclado.close();

      //Primeiramente converter de MB para mbps (cada MB equivale a 8 mbps)
      tamArquivo = tamArquivo * 8;
      //Variável tempo em segundos
      tempoSegundos = tamArquivo / velInternet;
      
      //Converter de segundos para minutos / pegar o tempo em segundos e dividir por 1minuto (60)
      tempoMinutos = tempoSegundos / 60;

      //System.out.print("O tempo em minutos é: " + tempoMinutos);
      //Formatando com 2 casas decimais
      System.out.format("O tempo em minutos é: %.2f", tempoMinutos);
  }
}