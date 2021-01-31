import java.util.stream.IntStream;

public class FindOutlier {
    static int find(int[] integers){

        int[] result = IntStream.of(integers)
                .filter(e -> e%2==0)
                .toArray();

        return result.length==1 ? result[0] : IntStream.of(integers).filter(e -> e%2!=0).toArray()[0];
    }
}
