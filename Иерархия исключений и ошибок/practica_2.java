public class SpecificExceptionsDemo {
    public static void main(String[] args) {
        
        // 1. ArithmeticException – деление на ноль
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException поймано: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException – выход за границы массива
        try {
            int[] arr = new int[3];
            int value = arr[5]; // недопустимый индекс
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException поймано: индекс вне диапазона");
        }

        // 3. IllegalArgumentException – некорректный аргумент метода
        try {
            setAge(-5); // возраст не может быть отрицательным
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException поймано: " + e.getMessage());
        }

        // 4. ClassCastException – некорректное приведение типов
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // нельзя привести String к Integer
        } catch (ClassCastException e) {
            System.out.println("ClassCastException поймано: " + e.getMessage());
        }

        // 5. NullPointerException – обращение к методу/полю null-объекта
        try {
            String text = null;
            int length = text.length(); // вызов метода на null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException поймано: попытка вызвать метод на null");
        }
    }

    // Метод, выбрасывающий IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст установлен: " + age);
    }
}