import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        float accumulation = 15_000;
        float total = 0;
        int monthNumber = 1;
        while (total < 2_459_000) {
            total = total + accumulation;
            total = total + total / 100;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total);
            monthNumber = monthNumber + 1;
        }

        //Задача 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        int a = 10;
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Задача 3
        float populace = 12000000;
        for (int year = 1; year <= 10; year++) {
            float birth = populace / 1000 * 17;
            float death = populace / 1000 * 8;
            populace = populace + birth - death;
            System.out.println("Год " + year + ", численность населения составляет " + populace);
        }

        //Задача 4
        float sum = 15000;
        int persent = 7;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * persent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum);
        }

        //Задача 5
        float sum1 = 15000;
        int month1 = 0;
        while (sum1 < 12_000_000) {
            sum1 = sum1 + sum1 / 100 * persent;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + sum1);
            }
        }

        //Задача 6
        float sum2 = 15000;
        int month2 = 0;
        while (month2 <= 9 * 12) {
            sum2 = sum2 + sum2 / 100 * persent;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + sum2);
            }
        }
        //Задача 7

        for (int friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        //Задача 8
        int yearNow = 2024;
        for (int year = yearNow - 200; year <= yearNow + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }
}