public class StringBuilderMethodsDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");

        // 1. append() – добавляет строку в конец
        sb.append(" append");
        System.out.println("1. append: " + sb); // Start append

        // 2. insert() – вставляет строку по указанному индексу
        sb.insert(5, " INSERT ");
        System.out.println("2. insert: " + sb); // Start INSERT  append

        // 3. delete() – удаляет символы с start по end-1
        sb.delete(5, 12);
        System.out.println("3. delete: " + sb); // Start append

        // 4. deleteCharAt() – удаляет один символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb); // Startppend (удалил пробел)

        // 5. replace() – заменяет часть строки
        sb.replace(0, 5, "BEGIN");
        System.out.println("5. replace: " + sb); // BEGINppend

        // 6. reverse() – переворачивает строку
        sb.reverse();
        System.out.println("6. reverse: " + sb); // dnep pNIGEB

        // 7. substring() – возвращает подстроку (не меняет StringBuilder)
        String sub = sb.substring(4, 8);
        System.out.println("7. substring: " + sub); // p pN

        // 8. length() – возвращает текущую длину
        System.out.println("8. length: " + sb.length());

        // 9. charAt() – возвращает символ по индексу
        System.out.println("9. charAt(2): " + sb.charAt(2)); // e

        // 10. setCharAt() – заменяет символ по индексу
        sb.setCharAt(0, 'X');
        System.out.println("10. setCharAt: " + sb); // Xnep pNIGEB
    }
}
