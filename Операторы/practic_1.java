public class Practice01Operators {
    public static void main(String[] args) {
        // 1. Арифметические операторы и составное присваивание
        int baseValue = 10;
        baseValue += 5;  // baseValue = 15
        baseValue -= 3;  // baseValue = 12
        baseValue *= 2;  // baseValue = 24
        baseValue /= 4;  // baseValue = 6
        baseValue %= 4;  // baseValue = 2

        // 2. Инкремент и декремент (префиксная и постфиксная формы)
        int counter = 5;
        int prefixInc = ++counter;   // Сначала ++, потом присваивание: counter=6, prefixInc=6
        int postfixInc = counter++;  // Сначала присваивание, потом ++: postfixInc=6, counter=7

        int decrement = 5;
        int prefixDec = --decrement; // decrement=4, prefixDec=4
        int postfixDec = decrement--;// postfixDec=4, decrement=3

        // 3. Операторы сравнения и равенства
        boolean isEqual = (baseValue == 2);      // false
        boolean isNotEqual = (baseValue != 3);   // true
        boolean isGreater = (10 > 5);            // true
        boolean isGreaterEq = (10 >= 10);        // true
        boolean isLess = (3 < 5);                // true
        boolean isLessEq = (5 <= 5);             // true

        // 4. Логические операторы
        boolean flagA = true;
        boolean flagB = false;
        boolean logicalAnd = flagA && flagB;     // false
        boolean logicalOr = flagA || flagB;      // true
        boolean logicalNot = !flagA;             // false

        // 5. Побитовые операторы
        int bitX = 5;  // 0101
        int bitY = 3;  // 0011
        int bitwiseAnd = bitX & bitY;    // 0001 -> 1
        int bitwiseOr = bitX | bitY;     // 0111 -> 7
        int bitwiseXor = bitX ^ bitY;    // 0110 -> 6
        int bitwiseNot = ~bitX;          // Инверсия битов: -6

        // 6. Операторы сдвига
        int shiftValue = 8; // 0000 1000
        int leftShift = shiftValue << 2;   // 32 (0010 0000)
        int rightShift = shiftValue >> 1;  // 4  (0000 0100)
        int unsignedShift = -16 >>> 2;     // 1073741820 (заполняет старшие биты нулями)

        // 7. Тернарный оператор
        int score = 85;
        String resultGrade = (score >= 60) ? "Сдано" : "Не сдано";

        // 8. Операторы + и += для конкатенации String
        String firstName = "Ольга";
        String lastName = "Антонова";
        String fullName = firstName + " " + lastName; // Конкатенация через +
        fullName += " (Java)"; // Конкатенация через +=

        int year = 2026;
        String message = fullName + ", год: " + year; // Автоприведение int к String

        // 9. Операторы группировки () и доступа к массиву []
        int[] numbers = {1, 2, 3};
        int arrayElement = numbers[1]; // Оператор []
        int calculated = (10 + 5) * 2; // Оператор () меняет порядок вычислений

        // Вывод для проверки
        System.out.println("Присваивание: " + baseValue);
        System.out.println("Префикс ++: " + prefixInc + " | Постфикс ++: " + postfixInc);
        System.out.println("Логика: &&=" + logicalAnd + " ||=" + logicalOr + " !=" + logicalNot);
        System.out.println("Побитовые: &=" + bitwiseAnd + " |=" + bitwiseOr + " ^=" + bitwiseXor);
        System.out.println("Сдвиги: <<=" + leftShift + " >>=" + rightShift);
        System.out.println("Тернарный: " + resultGrade);
        System.out.println("Строки: " + message);
        System.out.println("Массив: numbers[1] = " + arrayElement);
    }
}