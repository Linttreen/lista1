// trocar o valor de A e B
// changed_A e changed_B

import java.util.Scanner;


public class Variaveis {
    public static void main(String[] args){

        float A, B, changed_A, changed_B;

        Scanner leituraTeclado = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        A = leituraTeclado.nextFloat();

        System.out.println("Insira o valor de B: ");
        B = leituraTeclado.nextFloat();

        changed_A = B;
        changed_B = A;

        System.out.println("O valor inicial de A foi: " + A + " e B: " + B);
        System.out.println("Os novos valores são: A = " + changed_A + " e B = " + changed_B);

    }

}

