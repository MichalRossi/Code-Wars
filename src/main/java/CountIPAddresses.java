public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {

        String[] startArray = start.split("\\.");
        String[] endArray = end.split("\\.");

        int[] differences = new int[startArray.length];
        long result = 0;

        for(int i=0 ; i < startArray.length ; i++) {
            differences[i] = Integer.parseInt(endArray[i]) - Integer.parseInt(startArray[i]);
            result += differences[i]*Math.pow(256 , startArray.length-1-i);
            }

        return result;
    }
}
