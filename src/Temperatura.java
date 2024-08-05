import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        float celsius, fahrenheit, kelvin;
        
        Scanner leituraTeclado = new Scanner(System.in);
        
        System.out.println("Insira o valor da temperatura em Graus Celsius:");
        float celsius = leituraTeclado.nextFloat();
        
        float fahrenheit = (9.0F * celsius + 160.0F) / 5.0F;
        float kelvin = celsius + 273.0F;
        
        System.out.println("O valor que você inseriu foi " + celsius + "°C");
        System.out.println("O valor em Fahrenheit: " + fahrenheit + "°F");
        System.out.println("O valor em Kelvin:" + kelvin + "°K");
    }
}
