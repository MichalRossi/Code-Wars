public class KataSolution {

    public static String expand(String expr) {

        int exponent = Integer.parseInt(expr.split("\\^")[1]);  //exponent
        String basis = expr.split("\\^")[0].substring(1, expr.split("\\^")[0].length()-1); //part in bractes

        if(exponent == 0) return "1";

        if(exponent == 1) return basis ;

        int a = !(basis.split("[a-zA-Z]")[0].equals("") || basis.split("[a-zA-Z]")[0].equals("-")) ? Integer.parseInt(basis.split("[a-zA-Z]")[0]) : Integer.parseInt(basis.split("[a-zA-Z]")[0] + "1");
        int b = Integer.parseInt(basis.split("[a-zA-Z]")[1]);

        String x = basis.split("[+-]")[basis.charAt(0) == '-' ? 1 : 0].replaceAll("[0-9]","");

        if(b==0) return (long)Math.pow(a,exponent) + x + "^" + exponent;

        StringBuilder sb = new StringBuilder();

        for(int i = exponent; i >= 0; i--){
            sb.append(Math.pow(a,i)*Math.pow(b,exponent-i) > 0 ? "+" : "")
                    .append((long)(binominalCoefficient(exponent, exponent - i) * Math.pow(a, i) * Math.pow(b, exponent - i)))
                    .append(i > 0 ?  x  : "")
                    .append(i > 1 ? "^" + i: "");
        }

        return  sb.toString().replaceAll("-1"+x,"-"+ x).replaceAll("\\+1"+x,"+"+ x).replaceAll("^\\+","");
    }

    public static long factorial(long n){
        return n < 2 ? 1 : n*factorial(n-1);
    }

    public static long binominalCoefficient(long n, long k){
        return factorial(n) / (factorial(k) * factorial(n-k));
    }


}
