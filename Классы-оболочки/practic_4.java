int i1 = 128;
Integer a1 = i1;
Integer b1 = i1;

System.out.println("a1==i1 " + (a1 == i1));          // a1==i1 true
System.out.println("b1==i1 " + (b1 == i1));          // b1==i1 true
System.out.println("a1==b1 " + (a1 == b1));          // a1==b1 false
System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // a1.equals(i1) -> true
System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // b1.equals(i1) -> true
System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // a1.equals(b1) -> true


Блок с числом 128:
a1 == i1 -> true (сравнение объекта с примитивом: a1 распаковывается в int).
b1 == i1 -> true (аналогично).
a1 == b1 -> false (сравнение ссылок: созданы два разных объекта в куче).
a1.equals(i1) -> true (сравнение по значению).





int i2 = 127;
Integer a2 = i2;
Integer b2 = i2;

System.out.println("a2==i2 " + (a2 == i2));          // a2==i2 true
System.out.println("b2==i2 " + (b2 == i2));          // b2==i2 true
System.out.println("a2==b2 " + (a2 == b2));          // a2==b2 true
System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // a2.equals(i2) -> true
System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // b2.equals(i2) -> true
System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // a2.equals(b2) -> true


Блок с числом 127:
a2 == i2 -> true (распаковка).
b2 == i2 -> true (распаковка).
a2 == b2 -> true (сравнение ссылок: обе переменные указывают на один и тот же объект в кэше).
a2.equals(b2) -> true (сравнение по значению).



Для чего используется класс IntegerCache?
Экономия памяти: Кэширование позволяет избежать создания миллионов дублирующих объектов.
Повышение производительности: Операция извлечения готового объекта из массива кэша выполняется значительно быстрее,
 чем выделение памяти в куче и инициализация нового объекта.