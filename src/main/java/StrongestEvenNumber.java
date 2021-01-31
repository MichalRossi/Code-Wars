import java.util.ArrayList;
import java.util.List;

public class StrongestEvenNumber {

    public static int strongestEven(int n, int m) {
        int strongest = n + n%2;

        for(int i = strongest; i <= m; i=i+2){
            if(strongness(i) > strongness(strongest)) strongest = i;
        }

       return strongest;
    }
    
    public static int strongness(int n){
        int i =0;

        while(true){
            if(n%2!=0) return i;
            i++;
            n=n/2;
        }
    }
    
    
}
