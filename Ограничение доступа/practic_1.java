// Класс-демонстратор, в котором объявлены поля с разными уровнями доступа
class AccessLevel {
    public String publicField = "PUBLIC: Доступен отовсюду.";
    protected String protectedField = "PROTECTED: Доступен в пакете и наследникам.";
    String defaultField = "DEFAULT (package-private): Доступен только в этом пакете.";
    private String privateField = "PRIVATE: Доступен только внутри этого класса.";

    public void showAll() {
        // Внутри своего класса мы видим всё, даже private
        System.out.println("Внутри класса AccessLevel:");
        System.out.println("- " + publicField);
        System.out.println("- " + protectedField);
        System.out.println("- " + defaultField);
        System.out.println("- " + privateField);
    }
}

public class access_restrictions_Practic_1 {
    public static void main(String[] args) {
        AccessLevel obj = new AccessLevel();

        System.out.println("--- Проверка доступа из другого класса ---");

        // 1. Public — доступ будет
        System.out.println(obj.publicField);

        // 2. Protected — доступ будет (так как классы в одном пакете)
        System.out.println(obj.protectedField);

        // 3. Default — доступ будет (так как классы в одном пакете)
        System.out.println(obj.defaultField);

        // 4. Private — БУДЕТ ОШИБКА КОМПИЛЯЦИИ
        // System.out.println(obj.privateField);

        System.out.println("\nДоступ к private через публичный метод:");
        obj.showAll();
    }
}