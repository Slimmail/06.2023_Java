import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

    // Задание 2
    // Для списка из задачи про Солнечную систему удалить все повторяющиеся
    // элементы.
    // Необходимо заполнить список названиями планет Солнечной системы в
    // произвольном порядке и с повторениями, вывести название каждой планеты и
    // количество его повторений в списке

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int n = sc.nextInt();
        sc.close();
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        String[] morePlanets = randomStringArray(planets, n);
        System.out.println(Arrays.toString(morePlanets));

        // Удаление повторяющихся элементов
        String[] uniquePlanets = removeDuplicates(morePlanets);
        System.out.println("Уникальные планеты: " + Arrays.toString(uniquePlanets));
    }

    static String[] randomStringArray(String[] sourceArray, int n) {
        String[] myNewArray = new String[n];
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * (sourceArray.length));
            myNewArray[i] = sourceArray[randomIndex];
        }
        return myNewArray;
    }

    static String[] removeDuplicates(String[] array) {
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(array));
        return uniqueSet.toArray(new String[0]);
    }
}
