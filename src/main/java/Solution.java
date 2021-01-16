import java.util.Arrays;

public class Solution {

    public static String generate_bc(String url, String separator) {
        String[] ignored = new String[]{"the","of","in","from","by","with","and", "or", "for", "to", "at", "a"};
        StringBuilder result = new StringBuilder();

        String[] names = url.replaceAll("http://","").replaceAll("https://", "").split("/");
        String[] links = new String[names.length];
        String[] heads = new String[names.length];

        int resultLength = names.length;

        for (int i = 1; i < names.length; i++ ){
            heads[i] = names[i].replaceAll("-" ,  " ").replaceAll("(\\.html)|(\\.htm)|(\\.php)|(\\.asp)" ,  "").split("[?#]")[0].toUpperCase();

            if(heads[i].length() > 30 ){
                StringBuilder sb = new StringBuilder();
                String[] nameParts = names[i].split("-");

                Arrays.stream(nameParts)
                        .filter(s -> !Arrays.asList(ignored).contains(s))
                        .forEach(s -> sb.append(s.split("")[0].toUpperCase()));

                heads[i] = sb.toString();
            }

            links[i] =  i>1 ?  names[i-1] + "/" + names[i]  :  names[i];
        }

        if(names[names.length-1].contains("index") || names[names.length-1].split("[?#]")[0].equals("")){
            resultLength-- ;
        }

        if (resultLength==1) return "<span class=\"active\">HOME</span>";

        result.append("<a href=\"/\">HOME</a>").append(separator);

        for(int i = 1; i < resultLength-1; i++){
            result
                    .append("<a href=\"/")
                    .append(links[i])
                    .append("/\">")
                    .append(heads[i])
                    .append("</a>")
                    .append(separator);
        }

        result.append("<span class=\"active\">")
                .append(heads[resultLength-1])
                .append("</span>");


        return result.toString();
    }
}