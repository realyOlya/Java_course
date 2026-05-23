import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {
    public static void main(String[] args) {
        // Указываем путь к файлу (можно абсолютный или относительный)
        File inputFile = new File("data.txt");

        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(inputFile)) {
            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Прочитана строка: " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }

        // Альтернативный пример: чтение чисел из файла
        try (Scanner numberScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            while (numberScanner.hasNextInt()) {
                int value = numberScanner.nextInt();
                sum += value;
                System.out.println("Число: " + value);
            }
            System.out.println("Сумма чисел: " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}