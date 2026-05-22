// 1 Использование готовых констант
Boolean trueInstance = Boolean.TRUE;
Boolean falseInstance = Boolean.FALSE;

// 2 Автоупаковка
Boolean bool1 = true;
Boolean bool2 = false;

// 3 Фабричные методы Boolean.valueOf()
Boolean bool = Boolean.valueOf(true); // примитив
Boolean boolTrue = Boolean.valueOf("True");   // Строка. Вернет Boolean.TRUE
Boolean boolFalse = Boolean.valueOf("hello"); // Вернет Boolean.FALSE

// 4 Метод Boolean.getBoolean(String name)
Boolean isDeveloper = Boolean.getBoolean("user.is_developer");

// 5 Использование Reflection API
Boolean refBool = Boolean.class.getDeclaredConstructor(boolean.class).newInstance(true);