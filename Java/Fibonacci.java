import java.util.Scanner;

public class Fibonacci{
  public void chamarFibonacci(){

    Scanner prompt = new Scanner(System.in);

    int primeiro = 0;
    int segundo = 1;
    String sequenciaDeNumeros = "0 1";

    System.out.println("Digite a quantidade de numeros que voce quer que apareca na sequencia: ");
    int entrada = prompt.nextInt();

    for (int i = 0; i < entrada - 2; i++) {
      int soma = primeiro + segundo;
      sequenciaDeNumeros += " " + soma;
      int aux = soma;
      primeiro = segundo;
      segundo = soma;

    }
    System.out.println(sequenciaDeNumeros);
    
  }
}