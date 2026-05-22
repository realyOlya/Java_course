// Через имя класса
A.printVars();

// через имя класа
A obj = new A();
obj.printVars();

//через ссылку на объект
A a = null;
a.printVars();

//прямой вызов внутри того же класса A
public static void main(String[] args) {
    printVars();
}

//через статический импорт
import static A.printVars;
printVars();