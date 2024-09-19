package org.example;

public class Main {
    public static void main(String[] args) {

    }

    //Задание 1
    public static String fizzOrBuzz(int inputNumber){
        int number = inputNumber;

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("fizzbuzz");
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            System.out.println("fizz");
            return "fizz";
        } else if (number % 7 == 0) {
            System.out.println("buzz");
            return "buzz";
        } else {
            System.out.println(number);
            return "number";
        }
    }

    //Задание 2
    public static String makeReverseInstall(String inputWord){
        String word = inputWord;
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
        return reversed;
    }

    //Задание 3
    public static Boolean findReadRoot(double a, double b, double c){

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
            return true;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Only one root: x = " + x);
            return true;
        } else {
            System.out.println("No real roots");
            return false;
        }
    }

    //Задание 4
    public static void calculateN(){
        int n = 2;
        double result;

        do {
            result = 1.0 / (n * n) + n - 2;
            n++;
        } while (result >= Math.pow(10, -6));
        System.out.println("n = " + n + ", результат = " + result);
    }

    //Задание 5
    public static boolean checkPalindrome(String str){
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        int len = cleanedStr.length();

        // Проверяем, является ли строка зеркальной
        for (int i = 0; i < len / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}