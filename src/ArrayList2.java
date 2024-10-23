import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Please input n : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int ran = random.nextInt(30);
            list.add(ran);
        }
        System.out.println(list);

        System.out.println("Enter target : ");
        int target = scanner.nextInt();
          if (list.contains(target)){
              System.out.println(target + " soni to'plamda mavjud !");
          }
          else System.out.println(target + " soni mavjud emas");
        }
    }

