import java.io.FileInputStream;
import java.io.IOException;

/**
 * Демонстрация метода read() класса FileInputStream.
 * Читает байты из файла и выводит их как символы.
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            // read() возвращает следующий байт (0-255) или -1 при достижении конца
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}