package javaPractice;

import java.util.Scanner;

/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”
*/

public class TestTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        if (a > 7)
            System.out.println("Привет");
        scanner.close();
    }
}