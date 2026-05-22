public class Practice02BreakContinue {
    public static void main(String[] args) {
        // continue: пропускаем чётные числа
        System.out.println("=== continue: только нечётные ===");
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();

        // break: выход при достижении порога
        System.out.println("\n=== break: выход из цикла ===");
        int[] values = {5, 12, 8, 20, 3, 15};
        for (int value : values) {
            if (value > 10) {
                System.out.println("Найдено > 10: " + value + " → break");
                break;
            }
            System.out.println("Обработано: " + value);
        }

        // continue в while
        System.out.println("\n=== continue в while ===");
        int whileVal = 1;
        while (whileVal <= 7) {
            if (whileVal == 5) {
                whileVal++;
                continue;
            }
            System.out.print(whileVal + " ");
            whileVal++;
        }
        System.out.println();

        // Метка с break (выход из вложенного цикла)
        System.out.println("\n=== Метка: break outer ===");
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Достигли (1,1) → break outerLoop");
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}