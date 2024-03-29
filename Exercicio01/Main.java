import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculadora conta = new Calculadora();

        System.out.println("Qual operação gostaria de realizar?");
        System.out.println("Escolha entre:\t(+)\t(-)\t(*)\t(/)");

        conta.op = scan.next().charAt(0);

        System.out.println("Digite o primeiro numero:");
        conta.numSt = scan.nextInt();
        System.out.println("Digite o segundo numero:");
        conta.numNd = scan.nextInt();

        conta.operacao();

    }
}
