package ru.mirea.lab1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 0, y = 2147483647, i = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        while(i < 10) {
            numbers[i] = sc.nextInt();
            if(x < numbers[i])
                x = numbers[i];
            if(y > numbers[i])
                y = numbers[i];
            z += numbers[i];
            i++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}