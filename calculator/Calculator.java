package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double num1,num2;
        Scanner input= new Scanner(System.in);
        //input operator
        System.out.println("Press +,-,*,/ to perform the operation");
        operator = input.next().charAt(0);
        //input operands
        System.out.println("Enter two numbers for calculation");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        input.close();
            switch (operator) {
                case '+':
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                    break;
                case '-':
                    System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                    break;
                case '*':
                    System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Enter a non zero divisor");
                    } else {
                        System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                    }
                    break;
                default:
                    System.out.printf("%c is an invalid operator", operator);
            }
    }
}
