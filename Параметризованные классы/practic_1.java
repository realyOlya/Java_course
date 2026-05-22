/**
 * Практика #1: Примеры использования instanceof с параметризованными классами.
 * Из-за стирания типов нельзя проверить конкретный параметр типа,
 * но можно проверять сырой тип или wildcard.
 */
public class Practice1 {

    // Простой generic-класс
    static class Wrapper<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>();
        stringWrapper.setItem("Hello");

        Wrapper<Integer> intWrapper = new Wrapper<>();
        intWrapper.setItem(123);

        // 1. Проверка сырого типа (raw type) – допустимо, но вызывает предупреждение
        if (stringWrapper instanceof Wrapper) {
            System.out.println("stringWrapper является Wrapper (raw type)");
        }

        // 2. Безопасная проверка с wildcard (?)
        if (intWrapper instanceof Wrapper<?>) {
            System.out.println("intWrapper является Wrapper<?> (любой параметризованный Wrapper)");
        }

        // 3. Попытка проверить конкретный параметр – ОШИБКА КОМПИЛЯЦИИ
        // if (stringWrapper instanceof Wrapper<String>) { // не компилируется
        //     System.out.println("Это Wrapper<String>");
        // }

        // 4. Косвенная проверка через получение хранимого объекта
        if (stringWrapper.getItem() instanceof String) {
            System.out.println("Хранимый объект в stringWrapper – String");
        }

        if (intWrapper.getItem() instanceof Integer) {
            System.out.println("Хранимый объект в intWrapper – Integer");
        }
    }
}