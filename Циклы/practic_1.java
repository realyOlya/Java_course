public class Practice01InfiniteLoops {
    public static void main(String[] args) {
        //while: бесконечный цикл
        System.out.println("=== while (true) с выходом по условию ===");
        int whileCounter = 0;
        while (true) {
            System.out.println("while итерация #" + (whileCounter + 1));
            whileCounter++;
            if (whileCounter >= 3) {
                System.out.println("→ Выход из while по break");
                break; // обязательный выход, иначе цикл бесконечный
            }
        }

        // do-while: бесконечный цикл
        System.out.println("\n=== do-while (true) с выходом по условию ===");
        int doWhileCounter = 0;
        do {
            System.out.println("do-while итерация #" + (doWhileCounter + 1));
            doWhileCounter++;
            if (doWhileCounter >= 3) {
                System.out.println("→ Выход из do-while по break");
                break;
            }
        } while (true);

        // while: бесконечный из-за ошибки
        //  Пример «случайного» бесконечного цикла
        /*
        int errorValue = 1;
        while (errorValue < 10) {
            System.out.println("Завис...");
            // забыли errorValue++ → условие всегда true → бесконечный цикл
        }
        */

        // do-while: гарантированное выполнение
        System.out.println("\n=== do-while выполняется минимум 1 раз ===");
        int neverTrue = 10;
        do {
            System.out.println("Тело выполнилось, хотя условие ложно!");
            break; // чтобы не зациклить
        } while (neverTrue < 5); // условие сразу false
    }
}