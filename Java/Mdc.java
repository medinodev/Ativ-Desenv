import java.util.Scanner;

public class Mdc {
    public void chamarMdc() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para realizar o MDC: ");
        int a = prompt.nextInt();
        System.out.println("Digite o segundo numero para realizar o MDC: ");
        int b = prompt.nextInt();

        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        System.out.println("O máximo divisor comum dos dois inteiros é: " + a);
    }
}