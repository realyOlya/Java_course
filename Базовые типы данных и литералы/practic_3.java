public class Practice03VariableScope {
    public static void main(String[] args) {
        int firstValue = 1;
        {
            int secondValue = 2;
            // secondValue видна только внутри этого блока
        }
        // int thirdValue = firstValue + secondValue;
        // ошибка: переменная secondValue не определена за пределами блока {}

        System.out.println("Код не скомпилируется, так как область видимости secondValue ограничена блоком.");
    }
}

// Никакое, код упадет с ошибкой.