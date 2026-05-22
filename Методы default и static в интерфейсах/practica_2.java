public class InterfaceConflictDemo {

    // Первый интерфейс с default методом print()
    interface A {
        default void print() {
            System.out.println("A.print()");
        }
    }

    // Второй интерфейс с таким же default методом print()
    interface B {
        default void print() {
            System.out.println("B.print()");
        }
    }

    // Если класс реализует оба интерфейса, возникает конфликт.
    // Компилятор выдаёт ошибку: "class inherits unrelated defaults for print()"
    // Решение: переопределить метод в классе.

    static class C implements A, B {
        @Override
        public void print() {
            // Можно выбрать конкретную реализацию интерфейса через super
            A.super.print();   // вызов метода из A
            B.super.print();   // вызов метода из B
            System.out.println("C.print() – своя логика");
        }
    }

    // Альтернативное решение: полностью своя реализация без вызова родительских
    static class D implements A, B {
        @Override
        public void print() {
            System.out.println("D.print() – полностью своя реализация");
        }
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.print(); // A.print(), затем B.print(), затем C.print()

        D objD = new D();
        objD.print(); // только D.print()
    }
}