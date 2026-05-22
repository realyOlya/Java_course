// final-класс — от него нельзя унаследовать
final class FinalClass {
    public void someMethod() {
        System.out.println("FinalClass.someMethod()");
    }
}

// Попытка создать подкласс от final-класса — ОШИБКА КОМПИЛЯЦИИ!
/*
class SubClass extends FinalClass {  // Ошибка: cannot inherit from final FinalClass
}
*/

// Обычный класс — от него наследовать можно
class NormalClass {
    public void hello() {
        System.out.println("Hello from NormalClass");
    }
}

class SubOfNormal extends NormalClass {
    @Override
    public void hello() {
        System.out.println("Hello from SubOfNormal");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.someMethod(); // OK — объект создать можно

        // FinalClass child = new SubClass(); // Невозможно — класса SubClass не существует
    }
}