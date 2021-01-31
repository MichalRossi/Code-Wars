import java.util.ArrayList;
import java.util.List;

public class DoubleLinear {
    public static int dblLinear (int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int x = 0;
        int y = 0;

        while(list.size()<=n){
            int a = 2 * list.get(x) + 1;
            int b = 3 * list.get(y) + 1;

            if(a > b){
                list.add(b);
                y++;
            } else if(a < b){
                list.add(a);
                x++;
            }
            else {
                list.add(a);
                x++;
                y++;
            }
        }

        return list.get(n);
    }
}
