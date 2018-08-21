import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Calculate");
        Scanner in = new Scanner(System.in);
        boolean work = true;
        while (true) {
        int first, second;
        System.out.println("Enter first numbers: ");
        first = in.nextInt();
        //System.out.println();
        System.out.println("Enter second numbers: ");
        second = in.nextInt();
       // System.out.println();
        System.out.println("Choose operation: \n1 - Sum \n2 - Degree\n3 - Subtraction\n4 - Multiplication\n5 - Exit\n Your choise: ");
        int choose = in.nextInt();
        switch (choose) {
            case 1:
                sum(first, second);
                break;
            case 2:
                degree(first, second);
                break;
            case 3:
                subtraction(first, second);
                break;
            case 4:
                multiplication(first, second);
                break;
            default:
                work = false;
                break;
        }
    }




    }

    public static void sum(int first, int second){
        System.out.printf("Sum: %d", first+second);
        System.out.println();
    }

    public static void degree(int first, int second){
        System.out.printf("Degree: %d", first/second);
        System.out.println();
    }

    public static void subtraction(int first, int second){
        System.out.printf("Subtraction: %d", first-second);
        System.out.println();
    }

    public static void multiplication(int first, int second){
        System.out.printf("Subtraction: %d", first*second);
        System.out.println();
    }



}
