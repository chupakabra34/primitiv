package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int numberOne = Integer.parseInt(reader.readLine());
        System.out.println();
        System.out.print("Введите второе число: ");
        int numberTwo = Integer.parseInt(reader.readLine());
        System.out.println();
        System.out.print("Введите третье число: ");
        int numberThree = Integer.parseInt(reader.readLine());
        System.out.println();

        if (numberOne == numberTwo) System.out.println("3");
        if (numberOne == numberThree) System.out.println("2");
        if (numberTwo == numberThree) System.out.println("1");
    }
}
