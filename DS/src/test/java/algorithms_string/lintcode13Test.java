package algorithms_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class lintcode13Test {
    @Test
    void leetcode13Test1(){
        lintcode13 l = new lintcode13();
        String source = "afefegegegegag";
        String target = "gegegeg";
        assertEquals(5, l.strStr(source, target));
    }

}