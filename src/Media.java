import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int valor1, valor2, valor3, media;

        Scanner leituraTeclado = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro número: ");
        valor1 = leituraTeclado.nextInt();

        System.out.println("Insira o valor do segundo número: ");
        valor2 = leituraTeclado.nextInt();

        System.out.println("Insira o valor do terceiro número: ");
        valor3 = leituraTeclado.nextInt();

        media = ((valor1 * 1) + (valor2 * 2) + (valor3 * 3))/3;

        System.out.println("Os valores dos números foram: " + valor1 + ", " + valor2 + " e " + valor3);
        System.out.println("A média ponderada é de " + media);

    }
}