import java.util.Scanner;

public class Primos {

  public void chamarPrimos(){

    int aux = 0;
    Scanner prompt = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = prompt.nextInt();

    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        aux++;
      }
    }

    if (aux >= 1) {
      System.out.println("O número " + num + " não é primo");
      } else {
      System.out.println("O número " + num + " é primo");
      }
    }
}