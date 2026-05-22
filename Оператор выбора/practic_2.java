public class Practice02SwitchFallThrough {
    public static void main(String[] args) {
        System.out.println("=== Пример с пропущенным break ===");
        int inputValue = 2;
        int result = 0;

        switch (inputValue) {
            case 1:
                result = 1;
                System.out.println("Выполнен case 1");
                break;
            case 2:
                result = 2;
                System.out.println("Выполнен case 2 (нет break!)");
                // break отсутствует → выполнение "проваливается" дальше
            case 3:
                result = 3;
                System.out.println("Выполнен case 3");
                break;
            default:
                result = 99;
                System.out.println("Выполнен default");
        }

        System.out.println("Итоговое значение result: " + result);
        // Вывод при inputValue = 2:
        // Выполнен case 2 (нет break!)
        // Выполнен case 3
        // Итоговое значение result: 3

        System.out.println("\n=== Практическое применение fall-through ===");
        // Группировка case: несколько значений → одно действие
        int month = 3;
        String season = switch (month) {
            case 12, 1, 2 -> "Зима";     // синтаксис Java 14+
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Неизвестно";
        };
        System.out.println("Месяц " + month + " → " + season);

        // Классический способ группировки
        System.out.println("\n=== Группировка через fall-through (классика) ===");
        int dayOfWeek = 6; // суббота
        switch (dayOfWeek) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Будний день");
                break;
            case 6: case 7:
                System.out.println("Выходной день"); // выполнится для 6 и 7
                break;
            default:
                System.out.println("Некорректный день");
        }
    }
}