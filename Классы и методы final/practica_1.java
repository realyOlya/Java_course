class Parent {
    // Обычный метод — можно переопределить
    public void normalMethod() {
        System.out.println("Parent.normalMethod()");
    }

    // final-метод — переопределить нельзя
    public final void finalMethod() {
        System.out.println("Parent.finalMethod()");
    }
}

class Child extends Parent {
    // Переопределение обычного метода — допустимо
    @Override
    public void normalMethod() {
        System.out.println("Child.normalMethod()");
    }

    // Попытка переопределить final-метод — ОШИБКА КОМПИЛЯЦИИ!
    /*
    @Override
    public void finalMethod() {
        System.out.println("Child.finalMethod()");
    }
    */
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.normalMethod(); // Child.normalMethod()
        child.finalMethod();  // Parent.finalMethod() — final метод нельзя переопределить
    }
}