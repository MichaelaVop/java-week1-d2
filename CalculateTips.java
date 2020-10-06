import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.println("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        System.out.println("This is the gratuity " + (subtotal * gratuityRate / 100.00));
        double gratuity = (subtotal * gratuityRate / 100.00);
        System.out.println("This is total " + (subtotal + gratuity));


    }
}