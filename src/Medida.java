import java.util.Scanner;

public class Medida {
    public Medida() {
    }

    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Insira o valor da medida em metros:");
        float metros = leituraTeclado.nextFloat();
        float centimetros = metros * 100.0F;
        System.out.println("O valor que você inseriu foi de " + metros + " metros");
        System.out.println("O valor em Centímetros: " + centimetros + " cm");
    }
}