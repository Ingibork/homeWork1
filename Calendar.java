package Homework1;

import java.util.Scanner;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с
 * консоли.
 *     Вывести дату следующего дня в формате ;День.Месяц.Год;.
 *     Учесть переход на следующий месяц, а также следующий год.
 *     Форматирование строки ;День.Месяц.Год; вынести в отдельную
 * функцию.
 */


public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату");
        int data = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println(data + ". " + month + ". " + year);

/**
 * Почему после If к data не прибавляет 1?
 */
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 9
                || month == 11)&& data>0&&data<=30) {
            System.out.println(data + 1);
        }
        }

    }
