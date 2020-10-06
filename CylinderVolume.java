import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {
        
        final double pi = 3.14159;

        
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Radius: ");
        double radius = input.nextDouble();

        System.out.println("Please enter a length: ");
        double length = input.nextDouble();

        
        System.out.println("The area is: " + (radius * radius * pi));
        double area = radius * radius * pi;
        System.out.println("The volume of the cylinder is: " + (area * length));



    }


}