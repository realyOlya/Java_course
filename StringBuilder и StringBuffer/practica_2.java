public class StringConversionsDemo {
    public static void main(String[] args) {
        // 1. String -> StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb);

        // 2. String -> StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + sbf);

        // 3. StringBuilder -> String
        String fromSb = sb.toString();
        System.out.println("StringBuilder -> String: " + fromSb);

        // 4. StringBuffer -> String
        String fromSbf = sbf.toString();
        System.out.println("StringBuffer -> String: " + fromSbf);

        // 5. StringBuilder -> StringBuffer
        StringBuffer sbfFromSb = new StringBuffer(sb);
        System.out.println("StringBuilder -> StringBuffer: " + sbfFromSb);

        // 6. StringBuffer -> StringBuilder
        StringBuilder sbFromSbf = new StringBuilder(sbf);
        System.out.println("StringBuffer -> StringBuilder: " + sbFromSbf);
    }
}