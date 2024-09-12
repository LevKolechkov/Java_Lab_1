package org.example;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        class FizzBuzz {
            public static void fizzOrBuzz(){
                for (int i = 1; i <= 500; i++) {
                    if (i % 5 == 0 && i % 7 == 0) {
                        System.out.println("fizzbuzz");
                    } else if (i % 5 == 0) {
                        System.out.println("fizz");
                    } else if (i % 7 == 0) {
                        System.out.println("buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
        /*FizzBuzz.fizzOrBuzz();*/


        //Задание 2
        class ReverseInstall {
            public static void makeReverseInstall(){
                String str = "make install";
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println(reversed);
            }
        }
        /*ReverseInstall.makeReverseInstall();*/


        //Задание 3
        class RealRoot {
            public static void findReadRoot(double a, double b, double c){

                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Only one root: x = " + x);
                } else {
                    System.out.println("No real roots");
                }
            }
        }
        /*RealRoot.findReadRoot(1, -3, 2);*/

        //Задание 4
        class Calculator {
            public static void calculateN(){
                int n = 2;
                double result;

                do {
                    result = 1.0 / (n * n) + n - 2;
                    n++;
                } while (result >= Math.pow(10, -6));
                System.out.println("n = " + n + ", результат = " + result);
            }
        }
        /*Calculator.calculateN();*/

        //Задание 5
        class Polindrome {
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

        /*if(Polindrome.checkPalindrome("level")){
            System.out.println("String is polindrome");
        } else {
            System.out.println("String is not polindrome");
        };*/

    }
}

