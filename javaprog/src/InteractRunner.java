import java.util.Scanner;

/**
 * Class to start the calculator. Supports user input.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
            Calculate calc = new Calculate(0);
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Exit : (yes/no)");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }
}
