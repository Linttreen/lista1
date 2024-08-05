import java.util.Scanner;

public class IMC {
    public IMC() {
    }

    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Insira o valor do peso: ");
        float peso = leituraTeclado.nextFloat();
        System.out.println("Insira o valor da altura: ");
        float altura = leituraTeclado.nextFloat();
        float imc = peso / (float)Math.pow((double)altura, 2.0);
        System.out.println("Os valores da altura e do peso foram de " + altura + " e " + peso);
        System.out.println("O valor do IMC é de " + imc);
    }
}