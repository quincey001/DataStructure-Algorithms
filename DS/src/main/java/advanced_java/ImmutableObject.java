package advanced_java;
import java.util.ArrayList;
import java.util.List;
import advanced_java.ImmutableList;
public class ImmutableObject {
    /**
     * In object-oriented and functional programming, an immutable object is an object whose state cannot be modified after it is created
     *  given the scenario that there are three images that you want to download
     *  so you create a list to store their urls
     *
     */
    private static final List<String> URL_LIST = new ArrayList<>();
    /**
     * declare a static and final list doesn't mean it is an immutable list.
     */

    private static final List<String> URL = ImmutableList.of("www.baidu.com", "www.google.com", "www.youtube.com");
    public static void main(String[] args){
        /**
         *  URL_LIST = new ArrayList<>();
         *  you cannot initialize anywhere else
          */
        URL_LIST.add("www.google.com");//but you can change the content in it
        /**
         * if you are actually creating api where a certain piece of code like this is exposed to anther
         * developer that is using your code
         * this is actually extremely dangerous. because they cannot alter your code and your code may
         * or may not behave entirely differently
         */
        System.out.println(URL);
        URL.add("wwww");
    }
}
