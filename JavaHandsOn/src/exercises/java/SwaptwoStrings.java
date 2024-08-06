package exercises.java;

public class SwaptwoStrings {

    public static void main(String[] args) {
        swap();
    }

    public static void swap() {
        String a = "Hello";
        String b = "Hi";
        System.out.println(a + ", " + b);
        a= a+b; // a = HelloHi , b =Hi
        b=a.substring(0,a.length()-b.length()); //b = Hello, a= HelloHi
        a=a.substring(b.length());//b =Hello, a= Hi
        System.out.println(a + ", " + b);
    }

}
