import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка на идентичность ссылок
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null и совместимость типов
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Приведение к нужному типу
        Person other = (Person) obj;

        // 4. Сравнение значимых полей
        return id == other.id
                && age == other.age
                && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        // Всегда переопределяйте hashCode вместе с equals
        return Objects.hash(id, name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person(1, "Alice", 25);
        Person p2 = new Person(1, "Alice", 25);
        Person p3 = new Person(2, "Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
    }
}

/** Соглашения метода equals()
Рефлексивность
Для любого ненулевого объекта x вызов x.equals(x) должен возвращать true.

Симметричность
Для любых ненулевых x и y: если x.equals(y) возвращает true, то и y.equals(x) должен вернуть true.

Транзитивность
Для любых ненулевых x, y, z: если x.equals(y) и y.equals(z) возвращают true, то x.equals(z) также должно вернуть true.

Постоянство
При многократных вызовах x.equals(y) должен возвращаться один и тот же результат (либо всегда true, либо всегда false) при условии, что ни одно из сравниваемых полей не изменилось между вызовами.

Сравнение с null
Для любого ненулевого объекта x вызов x.equals(null) должен возвращать false.

Связь с hashCode()
Если два объекта равны по equals(), их hashCode() должны быть одинаковыми.
*/