import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class SumOfK {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        // your code
        List<List<Integer>> permutations = new ArrayList<>();

        if (k == ls.size()){
            int sum = 0;
            for (Integer l : ls) {
                int intValue = l;
                sum += intValue;
            }
            return sum <k ? sum : null;
        }

        if (k > ls.size() || ls.size()<= 1) return null;

        permutations = combinations(ls, k);

        List<Integer> distances = new ArrayList<>();

        for (List<Integer> element  : permutations){
            distances.add(element.stream()
                    .mapToInt(Integer::intValue)
                    .sum());
        }

        Collections.sort(distances);
        Integer result = distances.get(0);

        for(Integer element : distances){
            if(result.intValue() <element && element <= t) result = element;
        }

        return result.intValue() <= t ? result : null;

        //BARDZO DOBRY PRZYKLAD JA, NIE UZYWAĆ STRUMIENI!!!!!!!!!
//        return distances.stream()
//                .filter(p -> distances.get(0) < p  && p <= t)
//                .findFirst()
//                .orElse(null);





    }

    public static <T extends Comparable<? super T>> List<List<T>> combinations(List<T> items, int size) {
        if (size == 1) {
            List<List<T>> result = new ArrayList<>();
            for (T item : items) {
                result.add(Collections.singletonList(item));
            }
            return result ;
        }
        List<List<T>> result = new ArrayList<>();
        for (int i=0; i <= items.size() - size; i++) {
            T firstItem = items.get(i);
            List<List<T>> additionalItems = combinations(items.subList(i+1, items.size()), size-1) ;
            for (List<T> additional : additionalItems) {
                List<T> combination = new ArrayList<>();
                combination.add(firstItem);
                combination.addAll(additional);
                result.add(combination);
            }
        }
        return result ;
    }

}



