package advanced_java;

import java.awt.*;

public class StringBufferStringBuilder {
    /**
     * 1 - String objects are unchangeable object in java, if you change a string, it
     * will create another string object.
     * 2 - the StringBuffer object is mutable in java, it is used to change and
     * modify string objects.
     * 3 -
     */
    public static void m1(String s1){
        s1 = s1 + "lebron";
        System.out.println(s1);
    }
    public static void m2(StringBuilder s2){
        s2.append("lebron");
        System.out.println(s2);
    }
    public static void m3(StringBuffer s3){
        s3.append("lebron");
        System.out.println(s3);
    }
    public static void main(String[] ags){
        String s1 = "chris";
        m1(s1);
//        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("chris");
        m2(s2);
//        System.out.println(s2);
        StringBuffer s3 = new StringBuffer("chris");
        m3(s3);
//        System.out.println(s3);
    }
}
