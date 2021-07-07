import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-4);
        list1.add(-5);
        list1.add(-1);
        list1.add(5);
        list1.add(10);

        int count = 0;
        for(Integer i : list1) {
            if(i < 0)
                count++;
        }
        System.out.println(count);
    }
}
