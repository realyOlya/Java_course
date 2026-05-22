public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    // хотим переопределить Object.equals(Object obj)
    // допустили ошибку: параметр имеет тип Person, а не Object
    @Override
    public boolean equals(Person obj) {  // ошибка компиляции
        return this.name.equals(obj.name);
    }
}
// С аннотацией @Override, компилятор выдаст ошибку. Без аннотации @Override, код скомпилируется без ошибок, но метод equals(Person) станет перегруженным, а не переопределённым

// исправленный код
@Override
public boolean equals(Object obj) {  // параметр Object, а не Person
    if (this == obj) return true;
    if (!(obj instanceof Person)) return false;
    Person other = (Person) obj;
    return this.name.equals(other.name);
}