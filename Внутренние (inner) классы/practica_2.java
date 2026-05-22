//*
Внутренний класс имеет полный доступ ко всем полям и методам своего внешнего класса, включая те, что объявлены как private.
Возможность доступа внутри пары «внешний-внутренний класс» вообще не зависит от спецификаторов доступа. 
Внутренний класс является полноценным членом внешнего класса (как метод или поле), поэтому для него открыты абсолютно все
*/
public class Outer {
    private int privateField = 10;
    public int publicField = 20;
    protected int protectedField = 30;
    int defaultField = 40;

    private void privateMethod() {
        System.out.println("private method");
    }

    public class Inner {
        public void accessOuter() {
            // Внутренний класс видит ВСЁ во внешнем
            System.out.println(privateField);   // OK
            System.out.println(publicField);    // OK
            System.out.println(protectedField); // OK
            System.out.println(defaultField);   // OK
            privateMethod();                    // OK
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();
    }
}