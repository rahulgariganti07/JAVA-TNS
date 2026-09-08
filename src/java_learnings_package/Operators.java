package java_learnings_package;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Unary Operators
        System.out.println(++a);
        System.out.println(--a);

        // Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // Bitwise Operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        // Shift Operators
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        // Assignment Operators
        a = 10;
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
        a &= b;
        System.out.println(a);
        a |= b;
        System.out.println(a);
        a ^= b;
        System.out.println(a);
        a <<= 1;
        System.out.println(a);
        a >>= 1;
        System.out.println(a);
        a >>>= 1;
        System.out.println(a);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println(max);

        // instanceof Operator
        String name = "Rahul";
        System.out.println(name instanceof String);
    }
}