import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("Ravi","Ravi","Ravi","Ravi1","Ravi1","Ravi2","Ravi2");
        //ravi-1. ravi-2.

        HashMap<String, Integer> map = new HashMap<>();

        for(String str : list) {
            map.put(str, map.getOrDefault(str,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " ::: " + entry.getValue());
            }
        }
    }
}



