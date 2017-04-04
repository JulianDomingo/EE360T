import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        map.put(1, new ArrayList<Integer>(Arrays.asList(1, 2)));
        System.out.println(map);
    }
}
