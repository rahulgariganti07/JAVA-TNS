package java_learnings_package;

public class Main {
    public static void main(String[] args) {

        // byte range
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        // short range
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        // int range
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;

        // long range
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        // float range
        float floatMin = -Float.MAX_VALUE;
        float floatMax = Float.MAX_VALUE;

        // double range
        double doubleMin = -Double.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;

        // char range
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;

        // boolean values
        boolean booleanTrue = true;
        boolean booleanFalse = false;

        // Printing all ranges
        System.out.println("Byte Range: " + byteMin + " to " + byteMax);
        System.out.println("Short Range: " + shortMin + " to " + shortMax);
        System.out.println("Int Range: " + intMin + " to " + intMax);
        System.out.println("Long Range: " + longMin + " to " + longMax);
        System.out.println("Float Range: " + floatMin + " to " + floatMax);
        System.out.println("Double Range: " + doubleMin + " to " + doubleMax);
        System.out.println("Char Range: " + (int) charMin + " to " + (int) charMax);
        System.out.println("Boolean Values: " + booleanFalse + " or " + booleanTrue);
    }
}
