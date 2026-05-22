/**
 * Иерархия:
 * Throwable
 *   ├── Error
 *   ├── Exception
 *   │     └── RuntimeException
 */
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        
        // 1. Error – серьёзные проблемы, которые обычно не следует пытаться обрабатывать.
        //    Возникают из-за сбоев в JVM (OutOfMemoryError, StackOverflowError, VirtualMachineError).
        //    Программа не может их восстановить, обработка не имеет смысла.
        System.out.println("=== Error ===");
        System.out.println("Назначение: ошибки на уровне JVM, выход за пределы программного кода.");
        System.out.println("Пример: OutOfMemoryError, StackOverflowError.");
        System.out.println("Как правило, не обрабатываются, программа аварийно завершается.");
        System.out.println();

        // 2. Exception – контролируемые исключения (checked exceptions).
        //    Требуют обработки (try-catch или throws) на этапе компиляции.
        //    Отражают возможные внештатные ситуации, которые могут быть исправлены.
        System.out.println("=== Exception ===");
        System.out.println("Назначение: контролируемые исключения, обязательные для обработки.");
        System.out.println("Пример: IOException, SQLException, ClassNotFoundException.");
        System.out.println("Компилятор требует либо catch, либо throws.");
        System.out.println();

        // 3. RuntimeException – неконтролируемые исключения (unchecked exceptions).
        //    Наследуются от Exception, но не требуют явной обработки.
        //    Возникают из-за ошибок программирования (логических ошибок).
        System.out.println("=== RuntimeException ===");
        System.out.println("Назначение: ошибки логики программы, которых можно избежать.");
        System.out.println("Пример: NullPointerException, IllegalArgumentException, ArithmeticException.");
        System.out.println("Обрабатывать не обязательно, но можно для восстановления.");
        System.out.println();
        
        // Демонстрация: проверяемое исключение требует обработки
        try {
            Thread.sleep(100); // InterruptedException – checked
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}