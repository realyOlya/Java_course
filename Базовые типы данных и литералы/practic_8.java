interface Switchable {
    void turnOn();
}

// Реализация интерфейса в разных классах
class Lamp implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Лампа: Спираль нагрелась, свет пошел.");
    }

    public void changeBulb() {
        System.out.println("Лампа: Лампочка заменена.");
    }
}

class Radio implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Радио: Играет музыка на частоте 101.2 FM.");
    }
}

// 3. Главный класс для демонстрации
public class data_liter_Practic_8 {
    public static void main(String[] args) {

        // Использование var
        // Компилятор сам понимает, что deskLamp — это объект типа Lamp
        var deskLamp = new Lamp();
        var kitchenRadio = new Radio();

        System.out.println("--- Работа с конкретными объектами ---");
        deskLamp.turnOn();
        deskLamp.changeBulb(); // Метод, доступный только у Lamp

        System.out.println("\n--- Работа через интерфейс (Полиморфизм) ---");

        // Мы можем поместить разные объекты в массив типа интерфейса
        Switchable[] devices = { deskLamp, kitchenRadio };

        for (var device : devices) {
            // Нам не важно, лампа это или радио, мы знаем, что у них есть turnOn()
            device.turnOn();
        }

        // Еще один пример с var:
        // Тип переменной 'anotherDevice' будет Switchable
        var anotherDevice = (Switchable) new Lamp();
        System.out.println("\n--- Использование var с явным приведением к интерфейсу ---");
        anotherDevice.turnOn();
    }
}