package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int numberTemp = 0;
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

        System.out.printf("Введённые числа -> первое - %d, второе - %d, третье - %d \n", numberOne, numberTwo, numberThree);

        if (numberOne < numberThree) {
            numberTemp = numberOne;
            numberOne = numberThree;
            numberThree = numberTemp;
        }
        if (numberOne < numberTwo) {
            numberTemp = numberOne;
            numberOne = numberTwo;
            numberTwo = numberTemp;
        }
        if (numberTwo < numberThree) {
            numberTemp = numberTwo;
            numberTwo = numberThree;
            numberThree = numberTemp;
        }
        System.out.printf("Отсортированные числа -> первое - %d, второе - %d, третье - %d", numberOne, numberTwo, numberThree);
    }
}
