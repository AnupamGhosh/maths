class LucasTheorem {
    int MOD;
    long[] factorial;
    
    LucasTheorem(int MOD) {
        this.MOD = MOD;
        factorial = new long[MOD];
        invFact = new long[MOD];
        factorial[0] = 1;
        for (int i = 1; i < MOD; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
        }
    }

    long choose(int n, int r) {
        if (n < r) {
            return 0;
        } else if (n < MOD) {
            return factorial[n] * pow(factorial[r], MOD - 2) * pow(factorial[n - r], MOD - 2) % MOD;
        }
        return choose(n / MOD, r / MOD) * choose(n % MOD, r % MOD) % MOD; // Lucas Theorem
    }
	
    long pow(int base, int exp) {
        if (exp == 1) {
            return base;
        }
        long ans = pow(base, exp >> 1);
        ans = ans * ans % MOD;
        if (exp % 2 == 1) {
            ans = ans * base % MOD;
        }
        return ans;
    }
}

public class Main {
    public static void main (String[] args) {
        LucasTheorem combination = new LucasTheorem(1000003);
        int[] N = {692438152,396973201,371470000,382201820,1079381818,165846332,787591618,403089918,1081222583,370631452};
        int[] R = {346219076,198486600,185735000,191100910,539690909,82923166,393795809,201544959,540611291,185315726};
        for (int i = 0; i < 10; i++) {
            System.out.printf("%11d %11d %7d\n", N[i], R[i], combination.choose(N[i], R[i]));
        }
    }   
}
