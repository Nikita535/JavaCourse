package ru.mirea.lab2;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Выберите задание от 1-5: ");
       int n=sc.nextInt();


            switch (n) {
                case 1: {
                    System.out.println("Введите строку для подсчёта суммы цифр в ней: ");
                    Task1.sumDig();
                    break;
                }
                case 2: {
                    Task2.numPrime();
                    break;
                }
                case 3: {
                    Task3.countVowels();
                    break;
                }
                case 4:{
                    Task4.printNum();
                    break;
                }
                case 5:{
                    Task5.getOptimalCost();
                    break;
                }

            }
        }
    }

