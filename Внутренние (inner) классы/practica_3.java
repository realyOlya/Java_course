//*
Внешний класс имеет доступ ко абсолютно всем полям и методам своего внутреннего класса, включая те, которые объявлены как private.
Внутри этой пары классов спецификаторы доступа никак не ограничивают их взаимодействие друг с другом. Внешний класс видит приватные члены внутреннего, а внутренний - приватные члены внешнего.
Но если внутренний класс видит поля внешнего автоматически (благодаря скрытой ссылке), то внешнему классу для доступа к элементам внутреннего необходимо явно создать объект этого внутреннего класса.
*/
public class Outer {
    private class Inner {
        private int innerPrivate = 1;
        public int innerPublic = 2;
        protected int innerProtected = 3;
        int innerDefault = 4;

        private void innerPrivateMethod() { }
        public void innerPublicMethod() { }
    }

    public void test() {
        Inner in = new Inner(); // можно создать, т.к. Inner доступен внутри Outer

        // Доступ к полям внутреннего класса – зависит от их спецификаторов
        // System.out.println(in.innerPrivate); // Ошибка! private поле недоступно
        System.out.println(in.innerPublic);     // OK
        System.out.println(in.innerProtected);  // OK (Outer и Inner в одном классе)
        System.out.println(in.innerDefault);    // OK

        // in.innerPrivateMethod(); // Ошибка! private метод
        in.innerPublicMethod();    // OK
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}