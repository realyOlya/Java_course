import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Демонстрация метода write(int) класса FileOutputStream.
 * Записывает байты в файл.
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, 10}; // A, B, C, перевод строки
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            for (byte b : bytes) {
                fos.write(b); // запись одного байта
            }
            // запись массива байт
            byte[] another = {68, 69, 70};
            fos.write(another);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}