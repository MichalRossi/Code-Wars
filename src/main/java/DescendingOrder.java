import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] numArray = Integer.toString(num).split("");
        int[] sorted = new int[numArray.length];
        double result = 0;


        for(int i=0; i<numArray.length; i++){
            sorted[i] = Integer.parseInt(numArray[i]);
        }

        Arrays.sort(sorted);

        for(int i=numArray.length-1; i>=0; i--){
            result += sorted[i] * Math.pow(10,i) ;
        }

        return (int) result;
    }
}