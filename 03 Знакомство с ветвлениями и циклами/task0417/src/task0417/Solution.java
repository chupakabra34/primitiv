package task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
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
        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.printf("%d %d %d", numberOne, numberTwo, numberThree);
        } else if (numberOne == numberTwo) {
            System.out.printf("%d %d", numberOne, numberTwo);
        } else if (numberOne == numberThree) {
            System.out.printf("%d %d", numberOne, numberThree);
        } else if (numberTwo == numberThree) {
            System.out.printf("%d %d", numberTwo, numberThree);
        }
    }
}