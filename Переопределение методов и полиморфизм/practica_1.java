class Calculator {
    // Перегрузка по количеству параметров
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Перегрузка по типу параметров
    public double add(double a, double b) {
        return a + b;
    }
    
    // Перегрузка по порядку параметров (разные типы)
    public String add(String str, int num) {
        return str + num;
    }
    
    public String add(int num, String str) {
        return num + str;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));           // 5
        System.out.println(calc.add(2, 3, 4));        // 9
        System.out.println(calc.add(2.5, 3.7));       // 6.2
        System.out.println(calc.add("Result: ", 10)); // Result: 10
        System.out.println(calc.add(20, " points"));  // 20 points
    }
}