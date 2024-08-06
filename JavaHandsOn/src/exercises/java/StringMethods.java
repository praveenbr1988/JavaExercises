package exercises.java;

public class StringMethods {

    public static void main(String[] args) {
        String text = "  Praveen is a good learner  ";
        System.out.println("Length of String is : " +text.length());

        System.out.println("Character at 5th position is : " +text.charAt(5));
        System.out.println("First occurence of e position is : " +text.indexOf('e')); //first occurence
        System.out.println("Second occurence of e position is : " +text.indexOf('e',text.indexOf('e')+1)); //second occurence of e
        System.out.println(text.indexOf("is")); //Occurence of string
        System.out.println(text.indexOf("z")); //Returns -1 if there is no match

        //String comparison
        System.out.println(text.equals("Praveen"));
        System.out.println(text.equalsIgnoreCase("Praveen"));
        System.out.println(text.contains("Praveen"));

        //Stripping a substring
        System.out.println(text.substring(5,10));

        //trim before and after strings
        System.out.println(text.trim());
        System.out.println(text.stripLeading());
        System.out.println(text.stripTrailing());

        //replace
        System.out.println(text.replace("Praveen", "John"));

        //split---split and convert to Array of Strings
        String[] a = text.split(" ");
        for(String i: a )
            System.out.println(i);

        StringBuffer sb = new StringBuffer(text);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sbl = new StringBuilder(text);
        sbl.reverse();
        System.out.println(sbl);

        String text1 = "Praveen is a good learner";

        System.out.println(text.concat(" and Hard worker"));
        System.out.println(text1.compareToIgnoreCase("Praveen is a good learner"));

        System.out.println(text.contentEquals(sb));


    }
}
