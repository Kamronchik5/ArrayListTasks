import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("White");
        list.add("Black");
        list.add("Green");
        list.add("Blue");
        list.add("Grey");
        list.add("Red");
        list.add("RGB");
        System.out.println(list);

        list.set(0,"Changed");
        System.out.println(list);
        System.out.println(list.size());
    }
}
