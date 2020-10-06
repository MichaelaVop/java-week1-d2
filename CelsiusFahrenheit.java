import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the temperature.");
        byte celsius = input.nextByte();

        System.out.println("This is the temperature in Fahrenheit " + (1.8 * celsius + 32));


    }
}

