import java.util.Scanner;

public class ConsoleGreeting_Practic_1 {
    public static void main(String[] args) {
        // Создаем сканер для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос имени у пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine(); // Читаем всю строку

        // Формирование и вывод приветствия
        System.out.println("Привет, " + name);

        // Закрываем сканер (освобождаем ресурс)
        scanner.close();
    }
}