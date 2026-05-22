public class AnnotationExamples {

    // ==================== @Override ====================
    // Зачем: указывает, что метод переопределяет метод суперкласса.
    // Помогает компилятору проверить правильность переопределения.
    static class Parent {
        public void sayHello() {
            System.out.println("Hello from Parent");
        }
    }

    static class Child extends Parent {
        @Override
        public void sayHello() { // Без @Override код бы скомпилировался, но если бы имя было "sayHelo" - была бы ошибка
            System.out.println("Hello from Child");
        }
        
        // Следующий код вызовет ошибку компиляции, т.к. метод не переопределяет ни один из методов Parent
        // @Override
        // public void sayGoodbye() { }
    }

    //  @Deprecated 
    // Зачем: помечает элемент (класс, метод, поле) как устаревший.
    // Компилятор выдаст предупреждение при использовании такого элемента.
    static class OldLibrary {
        @Deprecated
        public void oldMethod() {
            System.out.println("This method is deprecated, use newMethod() instead");
        }
        
        public void newMethod() {
            System.out.println("New recommended method");
        }
    }

    // @SuppressWarnings 
    // Зачем: подавляет предупреждения компилятора (например, unchecked, deprecation).
    // Используется, когда вы уверены, что код корректен, но компилятор выдаёт предупреждение.
    static class SuppressDemo {
        @SuppressWarnings("unchecked") // подавляем предупреждение о непроверяемом приведении типа
        public void useRawList() {
            java.util.List rawList = new java.util.ArrayList(); // raw type
            rawList.add("String"); // предупреждение unchecked обычно, но мы подавили
            java.util.List<String> stringList = rawList; // unchecked conversion
        }
        
        @SuppressWarnings({"deprecation", "unused"}) // подавляем несколько предупреждений
        public void useDeprecated() {
            OldLibrary lib = new OldLibrary();
            lib.oldMethod(); // обычно предупреждение о deprecation, но мы подавили
            int unusedVar = 42; // предупреждение unused подавлено
        }
    }

    //  Демонстрация 
    public static void main(String[] args) {
        // @Override демонстрация
        Child child = new Child();
        child.sayHello(); // Hello from Child
        
        // @Deprecated демонстрация (без подавления получим предупреждение компиляции)
        OldLibrary lib = new OldLibrary();
        lib.oldMethod(); // IDE подчеркнёт как устаревший, но код работает
        lib.newMethod();
        
        // @SuppressWarnings демонстрация (методы выше с аннотациями компилируются без предупреждений)
        SuppressDemo demo = new SuppressDemo();
        demo.useRawList();
        demo.useDeprecated();
    }
}