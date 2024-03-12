import java.util.*;

public class MathOperations{
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sumInt = operations.add(12, 175);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = operations.add(18.5, 72.62, 69.12);
        System.out.println("Sum of three doubles: " + sumDouble);
        String concatenatedString = operations.add("Hello, ", "This is Math Operations in Java");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}