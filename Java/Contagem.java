import java.util.Scanner;

public class Contagem {
  public void chamarContagem() {

    Scanner prompt = new Scanner(System.in);
    System.out.println("Digite a quantidade números que você quer conferir");
    int num = prompt.nextInt();

    int inteiros = 0;

    for(int i = 0; i < num; i++){
      System.out.println("Digite o número" );
      double numero = prompt.nextDouble();

      if(Math.floor(numero) == numero){
        inteiros += 1;
      }
    }
  System.out.println("A quantidade de numero inteiros é: " + inteiros);
  }
}