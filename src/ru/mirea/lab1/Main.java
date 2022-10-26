package ru.mirea.lab1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        float x = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
            x += numbers[i];
        }
        System.out.println(x / 10);
    }
}