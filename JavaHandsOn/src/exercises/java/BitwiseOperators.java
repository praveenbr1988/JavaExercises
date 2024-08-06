package exercises.java;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        // AND
        System.out.println("a & b = " + (a & b));  // output: 1

        // OR
        System.out.println("a | b = " + (a | b));  // output: 7

        // XOR
        System.out.println("a ^ b = " + (a ^ b));  // output: 6

        // NOT
        System.out.println("~a = " + (~a));  // output: -6 (inverting 0101 gives 1010 which is -6 in two's complement)

        // Left Shift
        System.out.println("a << 2 = " + (a << 2));  // output: 20

        // Right Shift
        System.out.println("20 >> 2 = " + (20 >> 2));  // output: 5

        // Unsigned Right Shift
        System.out.println("-20 >>> 2 = " + (-20 >>> 2));  // output: 1073741819
    }
}
