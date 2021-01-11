import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("s");
        set.add("hdsgfu");
        set.add('s');
        set.add(78325);
        set.add(45.2f);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
