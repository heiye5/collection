import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("dsf");
        list.add(4);
        list.add('s');
        list.add(true);
        list.add(4.5);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }
    }
}
