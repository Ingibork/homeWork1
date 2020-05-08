package Calendar;

import java.util.Scanner;

public class calendar {

    /**
     * Имеются три числа - день, месяц и год, вводимые пользователем с
     * консоли.
     *     Вывести дату следующего дня в формате ;День.Месяц.Год;.
     *     Учесть переход на следующий месяц, а также следующий год.
     *     Форматирование строки ;День.Месяц.Год; вынести в отдельную
     * функцию.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
            System.out.println(day + "." + month + "." + year);
        } else if
        ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
                        && day > 0 && day <= 30) {
            day++;
            System.out.println(day + "." + month + "." + year);
//February
        }
        if (day > 0 && day < 28 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            day++;
            System.out.println(day + "." + month + "." + year);
        } else if (day > 0 && day <= 27 && year % 4 !=0) {
            day++;
            System.out.println(day + "." + month + "." + year);
        } else if (day == 29) {
            day = 1;
            month = 3;
            System.out.println(day + "." + month + "." + year);
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11)
                && day > 0 && day <= 29) {
            day++;
            System.out.println(day + "." + month + "." + year);
        } else if ((month == 4 || month == 6 || month == 9 || month == 11)
                && day == 30) {
            day = 1;
            month++;
            System.out.println(day + "." + month + "." + year);
        }

    }

}
