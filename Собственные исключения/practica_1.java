/**1. Без параметров
 * 2. С сообщением (String message)
 * 3. С сообщением и причиной (Throwable cause)
 */
public class MyFirstException extends Exception {

    // Конструктор 1: без параметров
    public MyFirstException() {
        super();
    }

    // Конструктор 2: с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор 3: с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    // Дополнительно: можно добавить конструктор только с причиной
    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

// Пример использования
class ExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void validateAge(int age) throws MyFirstException {
        if (age < 0) {
            throw new MyFirstException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст корректен");
    }
}