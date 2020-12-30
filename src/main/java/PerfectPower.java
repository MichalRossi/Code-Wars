public class PerfectPower {
    public static int[] isPerfectPower(int n) {
       final double  TOLERANCE = 1E-5;
       int k = 1;
       double root = 0.0;

        for(int i = 2; i <= Math.log(n) / Math.log(2); i++){
            root = Math.pow(n, (double) 1/i);

            if(Math.abs(Math.round(root) - root) < TOLERANCE ) {
                k=i;
                break;
            }
        }

        return k>1 ? new int[]{(int)Math.round(root) , k} : null;
    }
}