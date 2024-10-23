import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList3 {
    public static void reverse(ArrayList<Integer> list){
        Collections.reverse(list);
    }
    public static List<Integer> cut(ArrayList<Integer> list ,int first , int last){
        return new ArrayList<>(list.subList(first , last));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);

        reverse(list);
        System.out.println("The last result :" + list);

        List<Integer> subList = cut(list , 2,6);
        System.out.println(subList);
    }
}
