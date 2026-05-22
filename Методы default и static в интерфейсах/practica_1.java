public class InterfaceDefaultStaticDemo {

    // Интерфейс с абстрактным, default и static методами
    interface Vehicle {
        // Абстрактный метод
        void start();

        // Неабстрактный (default) метод – может быть переопределён в классе
        default void honk() {
            System.out.println("Vehicle: Beep beep!");
        }

        // Статический метод – принадлежит интерфейсу, не наследуется
        static void repair() {
            System.out.println("Vehicle: Repairing...");
        }
    }

    // Класс, переопределяющий default метод
    static class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car: Engine started");
        }

        @Override
        public void honk() {
            System.out.println("Car: Honk honk!");
        }
    }

    // Класс, не переопределяющий default метод (использует реализацию интерфейса)
    static class Bicycle implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bicycle: Pedaling");
        }
        // honk() остаётся как в Vehicle
    }

    public static void main(String[] args) {
        // Вызов методов через экземпляр Car
        Car car = new Car();
        car.start();     // Car: Engine started
        car.honk();      // Car: Honk honk! (переопределённый)

        // Вызов методов через экземпляр Bicycle
        Bicycle bike = new Bicycle();
        bike.start();    // Bicycle: Pedaling
        bike.honk();     // Vehicle: Beep beep! (унаследованный default)

        // Вызов статического метода – только через имя интерфейса
        Vehicle.repair(); // Vehicle: Repairing...

        // Ошибка: car.repair(); – статические методы не наследуются
    }
}
