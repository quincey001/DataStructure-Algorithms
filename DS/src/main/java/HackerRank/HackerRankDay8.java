package HackerRank;
import java.util.*;
import java.io.*;
public class HackerRankDay8 {
    /**
     * Given n names and phone numbers, assemble a phone book that maps friends' names to
     * their respective phone numbers. You will then be given an unknown number of names
     * to query your phone book for.
     * For each  queried, print the associated entry from your phone book on a new line
     * in the form name=phoneNumber;
     * if an entry for name is not found, print Not found instead.
     *
     * input:
     * 3
     * sam 99912222
     * tom 11122222
     * harry 12299933
     * sam
     * edward
     * harry
     * output:
     * sam=99912222
     * Not found
     * harry=12299933
     */
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> books = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            // System.out.print(name + phone);
            books.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            searching(books, s);
        }
        in.close();
    }
    private static void searching(Map m, String s){
        if(m.containsKey(s)){
            System.out.print(s + "=" + m.get(s));
        }else{
            System.out.print("Not found");
        }
        System.out.println();
    }
}
