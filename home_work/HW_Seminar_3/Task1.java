import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task1 {

    // 1.Пусть дан произвольный список целых чисел.

    // 1) Нужно удалить из него чётные числа
    // 2) Найти минимальное значение
    // 3) Найти максимальное значение
    // 4) Найти среднее значение

    public static void main(String[] args) {
        ArrayList<Integer> sourceList = randomArrayList(20, 20);
        System.out.println(sourceList.toString());
        int m = minValue(sourceList, 20);
        System.out.println(m);
        int max = maxValue(sourceList);
        System.out.println(max);
        double av = averageValue(sourceList);
        System.out.println(av);
        removingEvenNumbers(sourceList);
        System.out.println(sourceList.toString());

    }

    static ArrayList<Integer> randomArrayList(int size, int maxValue) // метод для создания рандомного массива

    {
        Random rnd = new Random();
        ArrayList<Integer> newRandomArray = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            newRandomArray.add(rnd.nextInt(maxValue + 1));
        }
        return newRandomArray;
    }

    static void removingEvenNumbers(ArrayList<Integer> sourceArray) { // метод для удаления четных элементов
        Iterator<Integer> iter = sourceArray.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }

    static int minValue(ArrayList<Integer> sourceArray, int maxValue) {

        int minimum = maxValue + 1;
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.get(i) < minimum)
                minimum = sourceArray.get(i);
        }
        return minimum;
    }

    static int maxValue(ArrayList<Integer> sourceArray) {

        int maximum = -1;
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.get(i) > maximum)
                maximum = sourceArray.get(i);
        }
        return maximum;
    }

    static double averageValue(ArrayList<Integer> sourceArray) {
        Iterator<Integer> iter = sourceArray.iterator();
        int amount1 = 0;
        // int amount2 = 0;
        while (iter.hasNext()) {
            amount1 += iter.next();
        }
        // System.out.println(amount1);
        // for (int i = 0; i < sourceArray.size(); i++) {
        // amount2 += sourceArray.get(i);
        // }
        // System.out.println(amount1);

        double average = ((double) amount1) / sourceArray.size();
        // System.out.println(average);
        return average;
    }

}
