// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Введите первое число 'a': ");
 int a = scanner.nextInt();
 System.out.print("Введите второе число 'b': ");
 int b = scanner.nextInt();

 System.out.println("Сравнение чисел: " + compare(a, b));
 System.out.println("Сложение: " + sum(a, b));
 System.out.println("Вычитание: " + difference(a, b));
 System.out.println("Умножение: " + product(a, b));
 System.out.println("Деление: " + quotient(a, b));
 }

 private static String compare(int a, int b) {
   if (a > b) {
    return "a > b";
   } else if (a == b) {
     return "a = b";
   } else {
     return "a < b";
   }
 }

 private static int sum(int a, int b) {
   return a + b;
 }

 private static int difference(int a, int b) {
   return a - b;
 }

 private static int product(int a, int b) {
   return a * b;
 }

 private static double quotient(int a, int b) {
   return (double) a / b;
 }
}
//Эта программа принимает на вход два целых числа a и b, сравнивает их и выводит результат сравнения в консоль. Затем она выполняет над этими числами операции сложения, вычитания, умножения и деления, также выводя результаты в консоль.