import java.util.Scanner;

public class Years {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter minutes: ");
        int minutes = input.nextInt();

        int years = minutes / (365 * 24 * 60);
        
        int rest = minutes % (365 * 24 * 60);

        int days = rest / (24 * 60);
        
        int leftMin = rest % (24 * 60);


      

        System.out.println("It is " + years + " years, " + days + " days and " + leftMin + " minutes.");

    }
}