import java.util.Scanner;

public class Somatorio {
  public void chamarSomatorio() {

    Scanner prompt = new Scanner(System.in);
    System.out.println("Digite a quantidade de número que você quer somar:");
    int num1 = prompt.nextInt();

    float soma = 0;

    for (int i = 0; i < num1; i++) {
      System.out.println("Digite o número para soma");
      float num2 = prompt.nextFloat();

      soma += num2;

    }

    System.out.println("O valor do somatório é: " + soma);

  }
}