import java.util.ArrayList;

public class ArrayList4 {
    public static void checking(ArrayList<String> list1 , ArrayList<String> list2 , ArrayList<String> list3){
        if(list1.get(0) == list2.get(0)){
            System.out.println(list3.add("Yes"));
        }
        if (list1.get(1) == list2.get(1)){
            System.out.println(list3.add("Yes"));
        }
        else System.out.println(list3.add("No"));

    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list1.add("Kamron");
        list1.add("Muhammad");
        list2.add("Kamron");
        list2.add("Humoyun");

        checking(list1,list2,list3);
    }
}
