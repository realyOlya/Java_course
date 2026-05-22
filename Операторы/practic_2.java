public class Practice02Instanceof {

    /** Базовый класс */
    static class Animal {
        void makeSound() { System.out.println("Звук животного"); }
    }

    /** Подкласс 1 */
    static class Dog extends Animal {
        @Override
        void makeSound() { System.out.println("Гав!"); }
        void fetch() { System.out.println("Принес палку"); }
    }

    /** Подкласс 2 */
    static class Cat extends Animal {
        @Override
        void makeSound() { System.out.println("Мяу!"); }
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog(); // Ссылка типа Animal, объект типа Dog
        Animal myCat = new Cat();
        Animal nullReference = null; // Ссылка указывает на null

        // Проверка принадлежности к классу и иерархии
        System.out.println("genericAnimal instanceof Animal: " + (genericAnimal instanceof Animal)); // true
        System.out.println("myDog instanceof Animal: " + (myDog instanceof Animal)); // true (наследование)
        System.out.println("myDog instanceof Dog: " + (myDog instanceof Dog));       // true
        System.out.println("myDog instanceof Cat: " + (myDog instanceof Cat));       // false

        // 🔍 Отдельный случай: применение instanceof к null
        // Оператор никогда не выбрасывает NullPointerException, всегда возвращает false
        System.out.println("null instanceof Animal: " + (nullReference instanceof Animal)); // false
        System.out.println("null instanceof Dog: " + (nullReference instanceof Dog));       // false

        // Безопасное приведение типов после проверки instanceof
        if (myDog instanceof Dog) {
            Dog specificDog = (Dog) myDog; // Приведение гарантированно безопасно
            specificDog.fetch();
        }
    }
}