public class Practice07ByteOverflowAnalysis {
    public static void main(String[] args) {
        int baseValue = 120;

        // byte firstByte = baseValue + 10; //  Ошибка компиляции: int нельзя присвоить byte без cast
        // byte thirdByte = baseValue + 1;  //  Ошибка компиляции: та же причина

        byte secondByte = (byte) (baseValue + 10); // 130 → -126 (байт хранит от -128 до 127)
        byte fourthByte = (byte) (baseValue + 1);  // 121 → 121

        System.out.println("byte c = (byte)(120 + 10): " + secondByte);
        System.out.println("byte d = (byte)(120 + 1): " + fourthByte);
    }
}