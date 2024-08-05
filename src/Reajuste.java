import java.util.Scanner;

public class Reajuste {
    public Reajuste() {
    }

    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Insira o valor do salário:");
        float salario = leituraTeclado.nextFloat();
        System.out.println("O valor do reajuste será de 10%");
        float reajuste = salario + salario * 10.0F / 100.0F;
        System.out.println("O valor inicial do salário era de " + salario);
        System.out.println("O valor do salário reajustado é de " + reajuste);
    }
}