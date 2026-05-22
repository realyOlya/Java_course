class Animal {
    protected String name = "Animal";
    
    public Animal() {
        System.out.println("Конструктор Animal без параметров");
    }
    
    public Animal(String name) {
        this.name = name;
        System.out.println("Конструктор Animal с параметром: " + name);
    }
    
    public void sound() {
        System.out.println("Animal издает звук");
    }
}

class Dog extends Animal {
    private String name = "Dog";
    
    // 1. super() - вызов конструктора суперкласса
    public Dog() {
        super();                     // вызов Animal()
        System.out.println("Конструктор Dog");
    }
    
    public Dog(String name) {
        super(name);                 // вызов Animal(String)
        System.out.println("Конструктор Dog с именем: " + name);
    }
    
    public void showNames() {
        // 2. super.поле - доступ к полю суперкласса
        System.out.println("super.name = " + super.name);   // Animal
        System.out.println("this.name = " + this.name);     // Dog
    }
    
    @Override
    public void sound() {
        // 3. super.метод() - вызов метода суперкласса
        super.sound();               // вызывает Animal.sound()
        System.out.println("Dog лает");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.showNames();
        dog1.sound();
        
        Dog dog2 = new Dog("Rex");
    }
}
