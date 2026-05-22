class A {
    int a1;                     // Default: доступен только внутри пакета
    public int a2;              // Public: доступен везде
    protected int a3;           // Protected: доступен в подклассах (B и C)
    private int a4;             // Private: доступен ТОЛЬКО в классе A

    void method1() { ... }           // Default: доступен подклассам в том же пакете
    public void method2() { ... }    // Public: доступен подклассам всегда
    protected void method3() { ... } // Protected: доступен подклассам всегда
    private void method4() { ... }   // Private: НЕ доступен в B и C
}

class B extends A {
    void testAccess() {
        a1 = 10;       // ОК (если B в том же пакете, что и A)
        a2 = 20;       // ОК (public всегда виден)
        a3 = 30;       // ОК (подкласс видит protected родителя)
        // a4 = 40;    // ОШИБКА: private не наследуется напрямую

        method1();     // ОК (если в одном пакете)
        method2();     // ОК
        method3();     // ОК
        // method4();  // ОШИБКА: метод скрыт в классе A
    }
}

class C extends B {
    // Класс C наследует всё, что досталось классу B от A
    void testMore() {
        a2 = 100;      // ОК
        a3 = 200;      // ОК
        method3();     // ОК

        // a4 и method4 всё так же недоступны,
        // так как они "заперты" внутри класса A
    }
}