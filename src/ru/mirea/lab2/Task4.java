package ru.mirea.lab2;

import java.util.Scanner;

public class Task4 {

    public static void printNum() {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String line = "*********";//повторяющиеся шаблоны для цифр
        String vertLineRight = "        *";
        String vertLineLeft = "*        ";
        String vertDoubleLine = "*       *";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < num.length(); j++) {
                if (i == 0) {
                    switch (num.charAt(j)) {
                        case '0': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '1': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '2': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '3': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '4': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '5': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '6': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '7': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '8': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '9': {
                            System.out.print(line + "   ");
                            break;
                        }

                    }
                }
                if (i > 0 && i < 4) {
                    switch (num.charAt(j)) {
                        case '0': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '1': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '2': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '3': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '4': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '5': {
                            System.out.print(vertLineLeft + "   ");
                            break;
                        }
                        case '6': {
                            System.out.print(vertLineLeft + "   ");
                            break;
                        }
                        case '7': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '8': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '9': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }

                    }
                }
                if (i == 4) {
                    switch (num.charAt(j)) {
                        case '0': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '1': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '2': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '3': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '4': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '5': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '6': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '7': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '8': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '9': {
                            System.out.print(line + "   ");
                            break;
                        }
                    }
                }
                if (i > 4 && i < 8) {
                    switch (num.charAt(j)) {
                        case '0': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '1': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '2': {
                            System.out.print(vertLineLeft + "   ");
                            break;
                        }
                        case '3': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '4': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '5': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '6': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '7': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '8': {
                            System.out.print(vertDoubleLine + "   ");
                            break;
                        }
                        case '9': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                    }
                }
                if (i == 8) {
                    switch (num.charAt(j)) {
                        case '0': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '1': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '2': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '3': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '4': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '5': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '6': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '7': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                        case '8': {
                            System.out.print(line + "   ");
                            break;
                        }
                        case '9': {
                            System.out.print(vertLineRight + "   ");
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}


