public class NullabilityJava {
    public static void main(String[] args) {
        String x;
        x = "hello";
        printString(x);

        x = null;
        printString(x);

        Object xx = "Hello";
        if(xx instanceof  String) {
            System.out.println(((String) xx).toUpperCase());
        }

    }

    public static void printString(String x) {
        if(x == null) {
            System.out.println("null!");
            return;
        }
        System.out.println(x.length() + ": " + x);
    }

}
