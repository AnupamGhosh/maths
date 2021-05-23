# maths
This package contains basic tasks in number theory
* Prime factors of a number
* All factors of a number
* Sieve of Eratosthenes
* Euler's totient function
    * Number of natural numbers up to **n** which are coprime to **n**
    * A<sup>−n</sup> mod X = (A<sup>−1</sup> mod X)<sup>n</sup> mod X = (A<sup>φ(X)−1</sup> mod X)<sup>n</sup> mod X
    * Gauss proves that a regular n-gon can be constructed with straightedge and compass if φ(n) is a power of 2
    * [summation of lcm & gcd](http://math.stackexchange.com/questions/761670/how-to-find-this-lcm-sum-function-textlcm1-n-textlcm2-n-cdots-t)
* Lucas Theorem
   * Finds <sup>n</sup>C<sub>r</sub> mod m, where m is prime & n > m. Complexity O(m + log<sub>m</sub> n * log m)
* [Exponentiation by Squaring](https://en.wikipedia.org/wiki/Exponentiation_by_squaring#Example_implementations)
   * fast computation of large positive integer powers of a number in O(log N)

---
##### Naive thoughts
* a<sub>1</sub> + a<sub>2</sub> + ... = S. 
  <br/>max(Σa<sub>1</sub>a<sub>2</sub>..) is when a<sub>1</sub> = a<sub>2</sub> = ...
  <br/> Problem: [Subdivided Slimes](https://community.topcoder.com/stat?c=problem_statement&pm=14059)
* Area of a polygon by Pick's theorem <br>
   A = B / 2 + I - 1 <br>
   B: No. of boundary points     I: No. of internal points <br>
   Problem: [Integral Points](https://www.hackerrank.com/contests/infinitum13/challenges/integral-points)
* repeated digit sum or [digital root of n](https://oeis.org/A010888) <code>n-9*floor((n-1)/9)</code>
* min(Σ|X - a<sub>i</sub>|) = median of A.
  <br>Problem: [Consecutive Snakes](https://www.codechef.com/problems/CONSESNK)
