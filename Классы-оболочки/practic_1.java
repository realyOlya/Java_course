public class class_shell_Practic_1 {
    public static void main(String[] args) {
        // 1. Десятичное число (обычная строка)
        Integer decimal = Integer.decode("123");
        System.out.println("Десятичное: " + decimal);

        // 2. Шестнадцатеричное число (префиксы 0x, 0X, #)
        Integer hex1 = Integer.decode("0xFF");
        Integer hex2 = Integer.decode("#FF");
        System.out.println("Из Hex (0xFF): " + hex1); // 255
        System.out.println("Из Hex (#FF): " + hex2);   // 255

        // 3. Восьмеричное число (префикс 0)
        Integer octal = Integer.decode("010");
        System.out.println("Из Octal (010): " + octal); // 8

        // 4. Отрицательные числа
        // Знак ставится ПЕРЕД префиксом системы счисления
        Integer negativeHex = Integer.decode("-0x10");
        System.out.println("Отрицательный Hex: " + negativeHex); // -16

        // 5. Использование с другими типами (например, Long)
        Long longVal = Long.decode("0x7FFFFFFFFFFFFFFF");
        System.out.println("Long из Hex: " + longVal);
    }
}