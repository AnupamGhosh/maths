class ApowB {
    long pow(long a, int b) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ret = ret * a;
            }
            a = a * a;
            b >>= 1;
        }
        return ret;
    }
    
    public static void main (String[] args) {
        ApowB solver = new ApowB();
        System.out.println(solver.pow(3, 10));
    }
}
