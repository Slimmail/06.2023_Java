import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    // 1) Напишите метод, который определит тип (расширение) файлов из текущей папки
    // и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg

    public static void main(String[] args) {
        // Получаем текущую папку
        File folder = new File(".");

        // Получаем список файлов из текущей папки
        File[] files = folder.listFiles();

        // Создаем карту для хранения расширений и их количества
        Map<String, Integer> extensionCountMap = new HashMap<>();

        // Перебираем файлы и определяем их расширения
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isFile()) {
                String fileName = file.getName();
                String extension = getExtension(fileName);

                // Обновляем количество расширений в карте
                if (extensionCountMap.containsKey(extension)) {
                    int count = extensionCountMap.get(extension);
                    extensionCountMap.put(extension, count + 1);
                } else {
                    extensionCountMap.put(extension, 1);
                }

                // Выводим результат для каждого файла
                System.out.println((i + 1) + " Rasshirenie fajla: " + extension);
            }
        }

        // Выводим итоговые результаты в консоль
        int index = 1;
        for (Map.Entry<String, Integer> entry : extensionCountMap.entrySet()) {
            String extension = entry.getKey();
            int count = entry.getValue();
            index++;
        }
    }

    // Метод для получения расширения файла
    private static String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return "";
    }

}
