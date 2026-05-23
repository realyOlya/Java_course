// Наш класс реализует AutoCloseable
class MyResource implements AutoCloseable {

    public void doWork() {
        System.out.println("Выполняем полезную работу с ресурсом...");
    }

    @Override
    public void close() {
        System.out.println("Ресурс автоматически закрыт!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Конструкция try-with-resources
        try (MyResource res = new MyResource()) {
            res.doWork();
            // Здесь может возникнуть ошибка, но close() всё равно вызовется
        } catch (Exception e) {
            System.out.println("Обработка исключения: " + e.getMessage());
        }

        System.out.println("Программа продолжает работу.");
    }
}

//Интерфейс AutoCloseable был введен в Java 7 для поддержки конструкции try-with-resources.
// Его главная задача — гарантировать, что внешние ресурсы (файлы, сетевые соединения, дескрипторы базы данных)
// будут закрыты автоматически, даже если в процессе работы возникло исключение.