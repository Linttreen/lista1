import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numero, antecessor, sucessor;
        
        Scanner leituraTeclado = new Scanner(System.in);
        
        System.out.println("Insira o valor do número: ");
        int numero = leituraTeclado.nextInt();
        
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        System.out.println("O valor do número inicial foi de " + numero);
        System.out.println("O seu antecessor é " + antecessor + " e seu sucessor é " + sucessor);
    }
}
