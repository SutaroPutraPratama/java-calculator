import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num1 = keyboardInput.nextDouble();

        System.out.print("Enter an operator : ");
        String operator = keyboardInput.next();

        System.out.print("Enter another number : ");
        double num2 = keyboardInput.nextDouble();

        if (operator.equals("+")){
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }else {
            System.out.println("Invalid Operator");
        }
    }
}
