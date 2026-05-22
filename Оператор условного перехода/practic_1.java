public class Practice01TernaryOperator {
    public static void main(String[] args) {
        int a = 2;
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println("a = " + a + " → i = " + i);

        // Тестирование всех ветвей
        int[] testValues = {1, 2, 5};
        for (int testValue : testValues) {
            int result = (testValue == 1) ? 1 : (testValue == 2) ? 2 : 3;
            System.out.println("input: " + testValue + " → output: " + result);
        }

        // Читаемая версия с переносами (рекомендуется для сложных условий)
        int b = 5;
        int formattedResult =
            (b == 1) ? 1 :
            (b == 2) ? 2 :
            3; // default
        System.out.println("Formatted: b = " + b + " → result = " + formattedResult);
    }
}