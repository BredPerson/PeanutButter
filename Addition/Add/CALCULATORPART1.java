import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class CALCULATORPART1{   
    
    public static void main(String[] args){
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers here");
        

    

        char op = sc.next().charAt(0);
        double o = 0;
        switch (op){
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

            case '2':
                o = Math.sqrt(num1);
                break;

            default:
                System.out.println("Try Again");
        }
        System.out.println("Answer");
        System.out.println();

        System.out.println(num1 + "" + op + "" + num2 + "=" + o);
    }
        }   