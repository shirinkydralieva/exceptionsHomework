import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            Integer number = scanner.nextInt();
            checkNumber(number);
        } catch (NegativeNumberException negativeNumberException){
            System.err.println("You entered a negative number!");
            negativeNumberException.printStackTrace();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("You entered an invalid character!");
            inputMismatchException.printStackTrace();
        }
    }

    public static void checkNumber(Integer number) throws NegativeNumberException {
        if (number <  0) throw new NegativeNumberException("[number < 0]");
    }
}