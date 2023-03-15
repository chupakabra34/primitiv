package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

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
        System.out.print("Введите четвёртое число: ");
        int numberFour = Integer.parseInt(reader.readLine());
        System.out.println();
        System.out.print(max4(numberOne, numberTwo, numberThree, numberFour));
    }

    public static int max4(int a, int b, int c, int d) {
        if (a == max3(a, b, c) && a > d)
            return a;
        else {
            if (b == max3(a, b, c) && b > d)
                return b;
            else {
                if (c == max3(a, b, c) && c > d)
                    return c;
                else
                    return d;
            }
        }
    }

    public static int max3(int a, int b, int c) {
        if (a > b && a > c) return a;
        else {
            if (b > a && b > c) return b;
            else return c;
        }
    }
}
