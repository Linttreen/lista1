import java.util.Scanner;

public class MRU {
    public static void main(String[] args) {
        float S, So, V, T;
        
        Scanner leituraTeclado = new Scanner(System.in);
        
        System.out.println("Insira o valor do espaço inicial (So): ");
        float So = leituraTeclado.nextFloat();
        
        System.out.println("Insira o valor da velocidade (V): ");
        float V = leituraTeclado.nextFloat();
        
        System.out.println("Insira o valor do tempo (T): ");
        float T = leituraTeclado.nextFloat();
        
        float S = So + V * T;
        
        System.out.println("Os valores iniciais foram: So = " + So + ", V = " + V + " e T = " + T);
        System.out.println("O valor do deslocamento é igual a  " + S);
    }
}
