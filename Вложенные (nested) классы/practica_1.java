public class NestedInInterfaceDemo {

    // Интерфейс 1: Drawable с вложенным классом Point
    interface Drawable {
        void draw();

        class Point {
            int x, y;
            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
            public void show() {
                System.out.println("Point(" + x + ", " + y + ")");
            }
        }
    }

    // Интерфейс 2: Calculator с вложенным классом Helper (статические методы)
    interface Calculator {
        int operate(int a, int b);

        class Helper {
            public static Calculator getAddition() {
                return (a, b) -> a + b;
            }
            public static Calculator getMultiplication() {
                return (a, b) -> a * b;
            }
        }
    }

    // Интерфейс 3: Messenger с вложенным классом Logger (статические и нестатические методы)
    interface Messenger {
        void send(String msg);

        class Logger {
            public static void log(String message) {
                System.out.println("[LOG] " + message);
            }
            public void info(String msg) {
                System.out.println("[INFO] " + msg);
            }
        }
    }

    // Демонстрация вызова методов вложенных классов
    public static void main(String[] args) {
        // 1. Использование Drawable.Point
        Drawable.Point p = new Drawable.Point(10, 20);
        p.show();

        // 2. Использование Calculator.Helper (статические методы)
        Calculator add = Calculator.Helper.getAddition();
        System.out.println("5 + 3 = " + add.operate(5, 3));
        Calculator mul = Calculator.Helper.getMultiplication();
        System.out.println("5 * 3 = " + mul.operate(5, 3));

        // 3. Использование Messenger.Logger
        Messenger.Logger.log("Start of program");          // вызов статического метода
        Messenger.Logger logger = new Messenger.Logger();  // создание экземпляра
        logger.info("Processing in progress");
    }
}