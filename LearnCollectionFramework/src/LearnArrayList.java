import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("satish");
        list.add("nitish");
        list.add("manish");
        list.add("Sumesh");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.isEmpty());

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("args = " + it.next());
        }
    }
}
