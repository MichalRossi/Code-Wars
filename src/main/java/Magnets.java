class Magnets {

    public static double doubles(int maxk, int maxn) {
        double sum = 0.0;

        for(int i = 1; i <= maxk; i++){
            for (int j = 1; j<=maxn; j++){
                sum+= 1.0 / (i * Math.pow(j + 1, 2 * i));
            }
        }

        System.out.println(sum);

        return sum;
    }
}