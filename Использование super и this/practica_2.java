class A {
  int a;
  void method() {
    ...
  }

}

class B extends A {
  ...
}

class C extends B {
  ...
  void method() {
    ...
    int a = super.a;
    super.method();
  }
  ...
}


super.a: Вернет значение переменной a, определенной в классе A.

super.method(): Выполнит код метода method(), написанный в классе A.