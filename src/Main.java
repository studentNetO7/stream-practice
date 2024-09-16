import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list2 = new ArrayList<>();
        for (int x : intList) {
            if (x > 0 && x % 2 == 0)
                list2.add(x);
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(i) > list2.get(j)) {
                    int temp = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, temp);
                }
            }
        }
        System.out.println(list2);
    }
}
