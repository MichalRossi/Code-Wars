
import java.util.Arrays;


class Cubes {

    public String isSumOfCubes(String s) {

        if(s.equals("")) return "Unlucky";

        StringBuilder result = new StringBuilder();
        String[] numbers = s.split("[^0-9]|[\\s\\p{Z}]");

        Arrays.stream(numbers)
                .filter(word -> !word.equals(""))
                .forEach(word -> cubicNumber(word,result));

        if(result.toString().equals("")) return "Unlucky";

        int sum = Arrays.stream(result.toString().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();

        result.append(sum).append(" Lucky");
        return !result.toString().equals(sum + " Lucky") ? result.toString() : "Unlucky";
    }

    static void cubicNumber(String number, StringBuilder result) {
        String[] digits = number.split("");
        int i;
        String finalNumber;
        int sumOfDigits= 0;

        if (digits.length > 2) {
            i = 3;
            finalNumber = number.substring(0,3);
        }
        else {
            i = digits.length;
            finalNumber = number;
        }

        for (int j = 0; j < i; j++) {
            sumOfDigits += (int) Math.pow(Integer.parseInt(digits[j]), 3);
        }

        if(sumOfDigits == Integer.parseInt(finalNumber)){
            result.append(sumOfDigits).append(" ");
        }

    }






}



