//Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição, subtração, multiplicação e divisão. Além disso, ele quer garantir que a calculadora seja fácil de usar, com métodos claramente definidos para cada operação

public class Calculadora {
    public float numSt;
    public float numNd;
    public char op;

    void operacao(){

        switch(op) {
            case '+':
                float soma = (numSt + numNd);
                System.out.println(numSt%.0f + " + " + numNd%.0f + " = " + soma%.0f);
                break;
            case '-':
                float sub = (numSt - numNd);
                System.out.println(numSt + " - " + numNd +" =" + sub);
                break;
            case '*':
                float mul = (numSt * numNd);
                System.out.println(numSt + " * " + numNd +" =" + mul);
                break;
            case '/':
                float div = (numSt / numNd);
                System.out.println(numSt + " / " + numNd +" =" + div);
                break;
            }
    }

}
