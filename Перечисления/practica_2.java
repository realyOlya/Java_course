public enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) { return x + y; }
        @Override
        public Operation inverse() { return MINUS; }
    },
    MINUS {
        @Override
        public double apply(double x, double y) { return x - y; }
        @Override
        public Operation inverse() { return PLUS; }
    },
    TIMES {
        @Override
        public double apply(double x, double y) { return x * y; }
        @Override
        public Operation inverse() { return DIVIDE; }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) { return x / y; }
        @Override
        public Operation inverse() { return TIMES; }
    };

    // Абстрактный метод – каждая константа обязана его реализовать
    public abstract double apply(double x, double y);

    // Дополнительный метод, возвращающий обратную операцию
    public abstract Operation inverse();

    // Ещё один дополнительный метод (не абстрактный)
    public String getSymbol() {
        switch (this) {
            case PLUS:   return "+";
            case MINUS:  return "-";
            case TIMES:  return "*";
            case DIVIDE: return "/";
            default:     return "?";
        }
    }

    public static void main(String[] args) {
        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f%n",
                a, op.getSymbol(), b, op.apply(a, b));
            System.out.printf("  Обратная операция: %s%n", op.inverse());
        }
    }
}