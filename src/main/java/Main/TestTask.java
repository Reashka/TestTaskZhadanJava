package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTask {
    static BufferedReader reader;
    public static void main(String[] args) throws IOException {

        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Пожалуйста, введите номер задания (1, 2, 3 или 4)");
        while(true) {
            String taskNumber = reader.readLine();
            if (!(taskNumber.matches("[1234]"))) {
                System.out.println("Вы ввели не число или такого задания нет! Пожалуйста, введите номер задания (1, 2, 3 или 4)");
            }
            else {
                switch (Integer.parseInt(taskNumber)) {
                    case 1: task1();
                        break;
                    case 2: task2();
                        break;
                    case 3: task3(arrayForTask3());
                        break;
                    case 4: task4();
                }
                break;
            }
        }
    }

    // Задание 1: составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void task1() throws IOException {
        System.out.println("Пожалуйста, введите число для задания 1");
        while (true) {
            try {
                if (Integer.parseInt(reader.readLine()) > 7) {
                    System.out.println("Привет");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число! Пожалуйста, введите число для задания 1");
            }
        }
    }

    // Задание 2: составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public static void task2() throws IOException {
        System.out.println("Пожалуйста, введите имя для задания 2");
        if (reader.readLine().equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");

        else
            System.out.println("Нет такого имени");
    }

    // Задание 3: составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3 (метод для чтения массива)
    public static int[] arrayForTask3() throws IOException {
        System.out.println("Пожалуйста, введите числа для задания 3 через пробел (например, 1 2 3 47 21)");

        while(true) {
            String numbersInString = reader.readLine();
            if (!(numbersInString.matches("[-\\d\\s]+"))) {
                System.out.println("Вы ввели не числа! Пожалуйста, введите числа для задания 3 через пробел (например, 1 2 3 47 21)");
            }
            else {
                String[] arrayOfNumbersInString = numbersInString.split(" ");
                int[] arrayOfNumbers = new int[arrayOfNumbersInString.length];
                for (int i = 0; i < arrayOfNumbersInString.length; i++) {
                    arrayOfNumbers[i] = Integer.parseInt(arrayOfNumbersInString[i]);
                }
                return arrayOfNumbers;
            }
        }
    }

    // Задание 3: составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3 (сам алгоритм)
    public static void task3(int[] arrayOfNumbers) throws IOException {
        for (int number: arrayOfNumbers) {
            if (number%3==0 && number!=0) {
                System.out.println(number);
            }
        }
    }

    // Задание 4 (ответ в текстовой форме): Дана скобочная последовательность: [((())()(())]]
    //- Можно ли считать эту последовательность правильной?
    //- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?
    public static void task4() {
        System.out.println("Ответ на задание №4: скобочная последовательность [((())()(())]] неправильная. Для того, чтобы она стала правильной, необходимо вторую скобку (первую круглую открывающую) заменить на квадратную открывающую - [[(())()(())]]");
    }
}
