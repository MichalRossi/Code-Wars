import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        List<Integer> primeFactors = new ArrayList<>();

        for(int element : l){
            primeFactors.addAll(getPrimeFactors(element));
        }

        primeFactors = primeFactors.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        StringBuilder sb = new StringBuilder();


        for(Integer element : primeFactors){
            int tempSum = 0;

            for (int number : l){
               if(isPrimeFactor(number,element)){
                   tempSum+=number;
               }
           }
            sb.append("(").append(element).append(" ").append(tempSum).append(")");
        }

        return sb.toString();
    }

    public static List<Integer> getPrimeFactors(int n){

        List<Integer> factors = new ArrayList<>();

        n = Math.abs(n);

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 2)
            factors.add(n);

        return factors;
    }

    public static boolean isPrimeFactor(int n, int factor){
        List<Integer> factors = getPrimeFactors(n);
         for(Integer element : factors){
             if (element == factor) return true;
         }

         return false;
    }




}
