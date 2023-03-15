package task0318;

/* 
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.


Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число.
5. Выведенный текст должен полностью соответствовать заданию.
6. Получить данные с клавиатуры можно через  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
7. Читать строки из BufferedReader можно через String a = reader.readLine();
8. ЧИСЛО ДОЛЖНО БЫТЬ int !!!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число и имя через пробел: ");
        String input = reader.readLine();
        String[] parts = input.split(" ");
        int num = Integer.parseInt(parts[0]);
        String name = parts[1];
        System.out.println(name + " захватит мир через " + num + " лет. Му-ха-ха!");
    }
}
