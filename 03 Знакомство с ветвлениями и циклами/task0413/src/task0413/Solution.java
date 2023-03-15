package task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int number = Integer.parseInt(reader.readLine());
        if (number == 1)
            System.out.println("понедельник");
        if (number == 2)
            System.out.println("вторник");
        if (number == 3)
            System.out.println("среда");
        if (number == 4)
            System.out.println("четверг");
        if (number == 5)
            System.out.println("пятница");
        if (number == 6)
            System.out.println("суббота");
        if (number == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}