// Перегрузка методов (Overloading)
class Calculator {
    // Перегрузка: разные типы параметров
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Перегрузка: разное количество параметров
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка: порядок типов параметров имеет значение
    public void printInfo(String label, int value) {
        System.out.println(label + ": " + value);
    }

    public void printInfo(int value, String label) {
        System.out.println(value + " (" + label + ")");
    }

    // Тип возвращаемого значения не влияет на перегрузку!
    // public double add(int a, int b) { ... } // Ошибка компиляции: сигнатура совпадает
}

//  Переопределение методов (Overriding)
class Vehicle {
    public void start() {
        System.out.println("Транспорт заводится");
    }

    public String getType() {
        return "Общий транспорт";
    }

    public void move(int speed) {
        System.out.println("Движется со скоростью: " + speed + " км/ч");
    }
}

class ElectricCar extends Vehicle {
    // @Override проверяет корректность переопределения на этапе компиляции
    @Override
    public void start() {
        System.out.println("Электромотор запущен тихо ⚡");
    }

    // Возвращаемый тип можно сузить (ковариантный возврат), но обычно оставляют тот же
    @Override
    public String getType() {
        return "Электромобиль";
    }

    // Расширяем логику родителя, сохраняя сигнатуру
    @Override
    public void move(int speed) {
        if (speed > 120) {
            System.out.println("Внимание! Высокий расход батареи.");
        }
        super.move(speed); // Явный вызов метода суперкласса
    }
}

// Точка входа
public class MethodOverloadOverrideDemo {
    public static void main(String[] args) {
        System.out.println(" Перегрузка (Overloading)");
        Calculator calc = new Calculator();
        System.out.println("int + int = " + calc.add(5, 3));
        System.out.println("double + double = " + calc.add(2.5, 3.7));
        System.out.println("int + int + int = " + calc.add(1, 2, 3));

        calc.printInfo("Счёт", 42);
        calc.printInfo(42, "Счёт");

        System.out.println("\n=== 2. Переопределение (Overriding) ===");
        Vehicle genericVehicle = new Vehicle();
        Vehicle myCar = new ElectricCar(); // Ссылка типа Vehicle, объект ElectricCar

        genericVehicle.start(); // Вызовет Vehicle.start()
        myCar.start();          // Вызовет ElectricCar.start() (динамический полиморфизм)

        System.out.println("Тип: " + myCar.getType());

        myCar.move(60);
        myCar.move(130);

        System.out.println("\n Ключевые различия");
        System.out.println("Overloading  : один класс, одинаковое имя, РАЗНЫЕ параметры, return type НЕ важен");
        System.out.println("Overriding   : класс-наследник, одинаковые ИМЯ И ПАРАМЕТРЫ, return type совместим, используется @Override");
    }
}