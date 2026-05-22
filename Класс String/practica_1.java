public class StringMethodsDemo {
    public static void main(String[] args) {
        // 1. length() - возвращает длину строки
        String str = "Hello, World!";
        System.out.println("1. length(): " + str.length()); // 13

        // 2. charAt(int index) - возвращает символ по индексу
        System.out.println("2. charAt(0): " + str.charAt(0)); // H

        // 3. substring(int begin, int end) - извлекает подстроку
        System.out.println("3. substring(0,5): " + str.substring(0,5)); // Hello

        // 4. indexOf(String s) - ищет первое вхождение подстроки
        System.out.println("4. indexOf('World'): " + str.indexOf("World")); // 7

        // 5. toUpperCase() / toLowerCase() - преобразование регистра
        System.out.println("5. toUpperCase(): " + str.toUpperCase()); // HELLO, WORLD!

        // 6. replace(char old, char new) - замена символов
        System.out.println("6. replace('l','x'): " + str.replace('l', 'x')); // Hexxo, Worxd!

        // 7. startsWith(String prefix) - проверяет начало строки
        System.out.println("7. startsWith('Hell'): " + str.startsWith("Hell")); // true

        // 8. endsWith(String suffix) - проверяет конец строки
        System.out.println("8. endsWith('orld!'): " + str.endsWith("orld!")); // true

        // 9. trim() - удаляет пробелы в начале и конце
        String spaced = "   Hello   ";
        System.out.println("9. trim(): '" + spaced.trim() + "'"); // 'Hello'

        // 10. split(String regex) - разбивает на массив строк
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.print("10. split(): ");
        for (String f : fruits) System.out.print(f + " "); // apple banana orange
        System.out.println();
    }
}