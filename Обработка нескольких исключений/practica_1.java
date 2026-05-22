public class MultiCatchDemo {

    public static void main(String[] args) {

        // Ситуация 1: несколько исключений обрабатываются одинаково
        // Используем оператор | в одном блоке catch
        try {
            // Меняем поведение для демонстрации разных исключений
            int choice = 1; // попробуйте 1, 2 или 3
            if (choice == 1) {
                int[] arr = new int[2];
                arr[5] = 10; // ArrayIndexOutOfBoundsException
            } else if (choice == 2) {
                String s = null;
                s.length();   // NullPointerException
            } else if (choice == 3) {
                Object o = "Hello";
                Integer i = (Integer) o; // ClassCastException
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ClassCastException e) {
            // Все три исключения обрабатываются одинаково
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        // Важно: в multi-catch (с |) исключения не могут быть в одной иерархии.
        // Например, нельзя написать catch (RuntimeException | NullPointerException e)
        // потому что NullPointerException является подклассом RuntimeException.
        // Компилятор выдаст ошибку.

        // Ситуация 2: иерархия Ex1 <-- Ex2 <-- Ex3 (чем выше по иерархии, тем ниже в коде)
        // Ex1 = Exception (суперкласс), Ex2 = RuntimeException, Ex3 = ArithmeticException
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {       // самый конкретный
            System.out.println("ArithmeticException (самый внутренний)");
        } catch (RuntimeException e) {          // более общий
            System.out.println("RuntimeException");
        } catch (Exception e) {                 // самый общий
            System.out.println("Exception");
        }
        // Если поменять порядок (сначала Exception, потом ArithmeticException), то компилятор выдаст ошибку:
        // "exception ArithmeticException has already been caught"
    }
}