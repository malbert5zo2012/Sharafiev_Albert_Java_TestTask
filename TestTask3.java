package javaPractice;

import java.util.Scanner;

/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
*/
public class TestTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int b = scanner.nextInt();
            if (b % 3 == 0)
                System.out.println(b);
        }
        scanner.close();
    }
}
