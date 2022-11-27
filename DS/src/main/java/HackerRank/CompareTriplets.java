package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    /**
     * If a[i] > b[i], then Alice is awarded 1 point.
     * If a[i] < b[i], then Bob is awarded 1 point.
     * If a[i] = b[i], then neither person receives a point.
     */
    public static List<Integer> compare(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alice = 0;
        int bob= 0;

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                alice++;
            }else if(a.get(i) == b.get(i)){
                alice += 0;
                bob += 0;
            }else{
                bob++;
            }
        }
        result.add(0, alice);
        result.add(1, bob);
        return result;
    }

}
