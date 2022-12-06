import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
                hm.put(1,"Satish");
                hm.put(2,"Manish");
                hm.put(3,"Abhishek");
                hm.put(4,"Kiran");

        System.out.println(hm);
        System.out.println(hm.get(3));

    }
}
