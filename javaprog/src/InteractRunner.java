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
            int first = 0, second = 0;
            boolean start = false;
            while (!exit.equals("yes")){
                if (start){
                    System.out.println("You will clear result : (yes  /no)");
                    exit = reader.next();
                    if (exit.equals("yes")){
                        calc.clearResult();
                    }
                }
                start = true;
                System.out.println("You will enter arguments : (yes  /no - use old)");
                exit = reader.next();
                if (exit.equals("yes")){
                    System.out.println("Enter first arg: ");
                    first = reader.nextInt();
                    System.out.println("Enter second arg: ");
                    second = reader.nextInt();
                }
                System.out.println("Choose operation: \n1 - Sum \n2 - Degree\n3 - Subtraction\n4 - Multiplication\n5 - Power\n6 - Exit\n Your choise: ");
                String choose = reader.next();
                switch (Integer.valueOf(choose)) {
                    case 1:
                        calc.add(first, second);
                        break;
                    case 2:
                        calc.delete(first, second);
                        break;
                    case 3:
                        calc.multiply(first, second);
                        break;
                    case 4:
                        calc.degree(first, second);
                        break;
                    case 5:
                        calc.pow(first, second);
                        break;
                    default:
                        break;
                }
                System.out.printf("Result: %d", calc.getResult());
                System.out.println();
                System.out.println("Exit : (yes/no)");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }
}
