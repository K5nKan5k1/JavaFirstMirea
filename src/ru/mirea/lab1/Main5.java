package ru.mirea.lab1;
import java.util.Scanner;
public class Main5 {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int b;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        System.out.println(getFactorial(b));
    }
}