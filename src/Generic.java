import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 */
public class Generic {
    public static void main(String[] args) {
        //指定String类型，list集合只能添加String类型
        List<String> list = new ArrayList<String>();

//        list.add(23);           //在集合添加非字符串类型会报错
        list.add("324d");
        list.add("re4d");
        list.add("er");
        list.add("mtkj");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
