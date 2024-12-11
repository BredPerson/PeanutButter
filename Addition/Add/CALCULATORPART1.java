import java.lang.Math;
import java.util.Scanner;

public class CALCULATORPART1{
    public static void main(String[] args){
        double num1, num2;
        System.out.println("Enter equation:");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextDouble();

        char op = sc.next().charAt(0);

        num2 = sc.nextDouble();
    
        double o = 0;
        String error = "Good";
        switch (op) {
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;

            case '^':
                o = Math.pow(num1, num2);
                break;

            case '~':
                o = Math.pow(num1, 1.0/num2);
                break;

            case '%':
                o = (num1 / num2) * 100;
                break;

            default:
                error = "Bad";
        }

        if (error == "Bad") {
            System.out.println(sc + " Doesn't Work Try Again");
        } else if (error == "Good") {
            System.out.println("Answer:");
            System.out.println(num1 + " " + op + " " + num2 + " " + "=" + " " + o);
        }
    }
}   