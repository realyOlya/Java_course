// Примитивные типы
// byte
byte b = 2;
switch (b) {
    case 1: System.out.println("byte 1"); break;
    case 2: System.out.println("byte 2"); break;
    default: System.out.println("byte default");
}

// short
short s = 100;
switch (s) {
    case 10: System.out.println("short 10"); break;
    case 100: System.out.println("short 100"); break;
}

// char
char c = 'A';
switch (c) {
    case 'A': System.out.println("char A"); break;
    case 'B': System.out.println("char B"); break;
}

// int
int i = 5;
switch (i) {
    case 1: System.out.println("int 1"); break;
    case 5: System.out.println("int 5"); break;
}


// Классы-обёртки
Byte byteObj = 3;
switch (byteObj) {
    case 3: System.out.println("Byte 3"); break;
    case 7: System.out.println("Byte 7"); break;
}

Short shortObj = 55;
switch (shortObj) {
    case 55: System.out.println("Short 55"); break;
}

Character charObj = 'Z';
switch (charObj) {
    case 'Z': System.out.println("Character Z"); break;
}

Integer intObj = 42;
switch (intObj) {
    case 42: System.out.println("Integer 42"); break;
    default: System.out.println("Integer default");
}


// Перечисления
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }

Day today = Day.MONDAY;
switch (today) {
    case MONDAY: System.out.println("Понедельник"); break;
    case TUESDAY: System.out.println("Вторник"); break;
    case WEDNESDAY: System.out.println("Среда"); break;
    // ... остальные дни
    default: System.out.println("Выходной");
}


// Строки
String fruit = "apple";
switch (fruit) {
    case "apple": System.out.println("Яблоко"); break;
    case "orange": System.out.println("Апельсин"); break;
    case "banana": System.out.println("Банан"); break;
    default: System.out.println("Неизвестный фрукт");
}