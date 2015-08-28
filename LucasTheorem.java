class LucasTheorem {
    int MOD;
    long[] factorial;
    long[] invFact;
    
    LucasTheorem(int MOD) {
        this.MOD = MOD;
        factorial = new long[MOD];
        invFact = new long[MOD];
        factorial[0] = invFact[0] = 1;
        for (int i = 1; i < MOD; i++) {
            factorial[i] = factorial[i - 1] * i % MOD;
            invFact[i] = invFact[i - 1] * pow(i, MOD - 2) % MOD;
        }
    }

    long choose(int n, int r) {
        if (n < r) {
            return 0;
        } else if (n < MOD) {
            return factorial[n] * invFact[r] * invFact[n - r] % MOD;
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
            System.out.println(N + " " + R + " " + combination.choose(N[i], R[i]));
        }
    }   
}
