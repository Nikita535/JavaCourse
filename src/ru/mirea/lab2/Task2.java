package ru.mirea.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    //простые числа - тк, которые имеют 2 делителя (1 и себя) 37 -простое, 38 - уже нет 1 - это никакое число)
    public static void numPrime() throws InputMismatchException {
        try {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a = 2;
            while (a <= n) {
                if ((n % a) == 0) {
                    System.out.print(a + " ");
                    while (n % a == 0) {
                        n = n / a;
                    }
                    a=2;
                }else
                a++;
            }
        }catch(InputMismatchException e){
            System.out.println("Введите целое число!");
        }
    }
}
