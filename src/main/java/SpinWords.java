import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SpinWords {
    public static String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();

        for(String element : sentence.split(" ")){
            StringBuilder tempWord = new StringBuilder();
            tempWord.append(element);

            if(element.length() > 4){
                tempWord.setLength(0);
                tempWord.append(element);
                tempWord = tempWord.reverse();
            }

            result.append(tempWord).append(" ");
        }

        result.deleteCharAt( result.length() - 1 );

        return result.toString();


    }
}
