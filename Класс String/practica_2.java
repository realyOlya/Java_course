import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Пример 1: простой разделитель
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("один");
        sj1.add("два");
        sj1.add("три");
        System.out.println(sj1); // один, два, три

        // Пример 2: с префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("яблоко").add("банан").add("апельсин");
        System.out.println(sj2); // [яблоко, банан, апельсин]

        // Пример 3: объединение двух StringJoiner
        StringJoiner sj3 = new StringJoiner("; ", "{", "}");
        sj3.add("красный").add("зеленый");
        StringJoiner sj4 = new StringJoiner("; ", "{", "}");
        sj4.add("синий").add("желтый");
        sj3.merge(sj4);
        System.out.println(sj3); // {красный; зеленый; синий; желтый}

        // Пример 4: пустой StringJoiner с префиксом/суффиксом
        StringJoiner empty = new StringJoiner(", ", "<", ">");
        System.out.println(empty); // <>(пусто, но префикс и суффикс отображаются)
        System.out.println(empty.toString()); // <>
    }
}