import java.util.Scanner;

public class fahrenToCencius {
    public static double fahrenToCenciuss(double F) {
        return (5.0 / 9) * (F - 32);

    }

    public static double cenciussToFarahen(double C) {
        return (9 * C) / 5 + 32;

    }

    public static void main(String[] args) {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1. Farhen to Cencius");
            System.out.println(" Press 0. Cencius to Farhen");
            System.out.println("Press 2 to Exit");
            System.out.println(" Enter your choice ");
            choice = scanner.nextInt();
            double temp=4;
            if (choice ==1|| choice== 0) {
                System.out.println("Enter your temperature ");
                temp = scanner.nextDouble();
            }
            if (choice == 0) {
                System.out.println(cenciussToFarahen(temp));
            } else if (choice == 1) {
                System.out.println(fahrenToCenciuss(temp));
            }
        } while (choice != 2);


    }

}
