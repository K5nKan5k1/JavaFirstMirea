package ru.mirea.lab1;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            String j = String.format("%f", 1./i);
            System.out.println(j);
        }
    }
}