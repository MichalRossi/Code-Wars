import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        for(int i = 1 ; i < arr.length -1 ; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                peaks.add(arr[i]);
                pos.add(i);
            } else if (arr[i - 1] < arr[i] && arr[i] == arr[i + 1]) {
                for (int j = i + 2; j < arr.length; j++) {

                    if (arr[j] > arr[i]) {
                        break;
                    } else if (arr[j] < arr[i]) {
                        peaks.add(arr[i]);
                        pos.add(i);
                        break;
                    }
                }
            }
        }

        result.put("pos", pos);
        result.put("peaks", peaks);

        return result;
    }
}