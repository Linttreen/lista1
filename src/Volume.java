import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        float volume, altura, largura, comprimento;
        
        Scanner leituraTeclado = new Scanner(System.in);
        
        System.out.println("Insira o valor da altura em metros:");
        float altura = leituraTeclado.nextFloat();
        
        System.out.println("Insira o valor da largura em metros:");
        float largura = leituraTeclado.nextFloat();
        
        System.out.println("Insira o valor do comprimento em metros:");
        float comprimento = leituraTeclado.nextFloat();
        
        float volume = altura * largura * comprimento;
        
        System.out.println("O valor que você inseriu foi de " + altura + " m de altura, " + largura + " m de largura e " + comprimento + " m de comprimento.");
        System.out.println("O valor do volume é de: " + volume);
    }
}
