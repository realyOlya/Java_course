// String + базовые типы данных
public class PrimitiveConcatenation {
    public static void main(String[] args) {
        String greeting = "Результат: ";
        int score = 100;
        double price = 49.99;
        boolean isReady = true;
        char letter = 'A';
        // Перегруженный '+' преобразует примитивы в строки и склеивает их
        System.out.println(greeting + score);   // 100
        System.out.println("Цена: " + price);    // 49.99
        System.out.println("Статус: " + isReady); // true
        System.out.println("Класс: " + letter);  // A
    }
}

// String + другие объекты
class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Кот по имени " + name;
    }
}

public class ObjectConcatenation {
    public static void main(String[] args) {
        Cat myCat = new Cat("Барсик");
        String text = "У меня дома живет ";
        String result = text + myCat;
        System.out.println(result);
  }
}
        // Выведет: У меня дома живет Кот по имени Барсик
    }
}