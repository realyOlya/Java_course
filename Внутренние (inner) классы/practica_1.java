public class Outer {
    // public – доступен везде
    public class PublicInner { }

    // protected – доступен внутри пакета и в подклассах Outer
    protected class ProtectedInner { }

    // default – доступен только внутри пакета
    class DefaultInner { }

    // private – доступен только внутри Outer
    private class PrivateInner { }

    // Демонстрация использования внутри внешнего класса
    public void test() {
        PublicInner p = new PublicInner();    // OK
        ProtectedInner pr = new ProtectedInner(); // OK
        DefaultInner d = new DefaultInner();  // OK
        PrivateInner pri = new PrivateInner(); // OK
    }
}

// Другой класс в том же пакете
class AnotherInSamePackage {
    void method() {
        Outer o = new Outer();
        Outer.PublicInner p = o.new PublicInner();      // OK
        Outer.ProtectedInner pr = o.new ProtectedInner(); // OK
        Outer.DefaultInner d = o.new DefaultInner();    // OK
        // Outer.PrivateInner pri = o.new PrivateInner(); // Ошибка! private
    }
}

// Класс в другом пакете, наследующий Outer
package other;
import outer.Outer;
class Subclass extends Outer {
    void method() {
        Outer o = new Outer();
        Outer.PublicInner p = o.new PublicInner();      // OK
        Outer.ProtectedInner pr = o.new ProtectedInner(); // OK (через наследование)
        // Outer.DefaultInner d = o.new DefaultInner(); // Ошибка: default недоступен в другом пакете
        // Outer.PrivateInner pri = ... // Ошибка
    }
}