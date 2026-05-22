public class Practice01PrimitiveTypes {
    public static void main(String[] args) {
        // Примитивы
        byte sampleByte = 100;
        short sampleShort = 30000;
        int sampleInt = 2_000_000_000;
        long sampleLong = 9_000_000_000_000L;
        float sampleFloat = 3.14f;
        double sampleDouble = 2.718281828;
        char sampleChar = 'A';
        boolean sampleBoolean = true;

        // Классы-оболочки (могут хранить null)
        Byte nullByte = null;
        Short nullShort = null;
        Integer nullInt = null;
        Long nullLong = null;
        Float nullFloat = null;
        Double nullDouble = null;
        Character nullChar = null;
        Boolean nullBoolean = null;

        System.out.println("byte: " + sampleByte);
        System.out.println("short: " + sampleShort);
        System.out.println("int: " + sampleInt);
        System.out.println("long: " + sampleLong);
        System.out.println("float: " + sampleFloat);
        System.out.println("double: " + sampleDouble);
        System.out.println("char: " + sampleChar);
        System.out.println("boolean: " + sampleBoolean);
        System.out.println("\nNull wrappers: " + nullInt + ", " + nullChar + ", " + nullBoolean);
    }
}