public class StringSplit {


    public static String[] solution(String s) {
        //Write your code here


        String[] result = new String[(s.length()+1)/2];

        for(int i = 0; i<s.length()/2; i++){
            result[i] = s.charAt(2*i) + Character.toString(s.charAt(2*i+1));
        }

        if(s.length()%2!=0){
            result[result.length-1] = s.charAt(s.length()-1) + "_";
        }

        return result;
    }


}