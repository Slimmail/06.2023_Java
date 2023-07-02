import java.util.Scanner;

/**
 * HW_Seminar_1
 */
public class HW_Seminar_1 {

    public static void main(String[] args) {
        // numerates(100);
        // triangularNumber(4);
        // factNumber(4);
        simple_calc();
    }

    // 1.1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
    // (произведение чисел от 1 до n)

    static void triangularNumber(int numMax) {

        int sumFinish;
        sumFinish = 0;
        for (int i = 0; i < numMax + 1; i++) {
            sumFinish += i;

        }
        System.out.println(sumFinish);

    }

    // 1.2) Вычислить n!
    // (произведение чисел от 1 до n)

    static void factNumber(int numMax) {

        int sumFinish;
        sumFinish = 1;
        for (int i = 1; i < numMax + 1; i++) {
            sumFinish *= i;

        }
        System.out.println(sumFinish);

    }

    // 2) Вывести все простые числа от 1 до 1000

    static void numerates(int numMax) {
        for (int i = 0; i < numMax + 1; i++) {
            System.out.println(i);
        }

    }

    // 3) Реализовать простой калькулятор

    static void simple_calc() {
        System.out
                .println("КАЛЬКУЛЯТОР \nвыберете действие: \n1. сложение \n2. вычитание \n3. умножение \n4. деление");
        System.out.println("Введите номер желаемой операции: ");

        Scanner n = new Scanner(System.in);
        int numOperation = n.nextInt();

        System.out.print("\033[H\033[J"); // очищаем консоль

        System.out.println("Введите первое число: ");
        float x = n.nextFloat();
        System.out.println("Введите второе число: ");
        float y = n.nextFloat();

        System.out.print("\033[H\033[J");

        switch (numOperation) {
            case 1:
                System.out.println("результат сложения:");
                System.out.println(x + y);
                break;
            case 2:
                System.out.println("результат вычитания:");
                System.out.println(x - y);
                break;
            case 3:
                System.out.println("результат умножения:");
                System.out.println(x * y);
                break;
            case 4:
                System.out.println("результат деления:");
                System.out.println(x / y);
                break;

        }

        simple_calc();
    }

}