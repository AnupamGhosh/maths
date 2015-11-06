# maths
This package contains basic tasks in number theory
* Prime factors of a number
* All factors of a number
* Sieve of Eratosthenes
* Euler's totient function
    *  A<sup>−n</sup> mod X = (A<sup>−1</sup> mod X)<sup>n</sup> mod X = (A<sup>φ(X)−1</sup> mod X)<sup>n</sup> mod X
    *  Gauss proves that a regular n-gon can be constructed with straightedge and compass if φ(n) is a power of 2
* Lucas Theorem
   * Finds <sup>n</sup>C<sub>r</sub> mod m, where m is prime & n > m. Complexity O(m + log<sub>m</sub> n * log m)

---
##### Naive thoughts
* a<sub>1</sub> + a<sub>2</sub> + ... = S. 
  <br/>max(Σa<sub>1</sub>a<sub>2</sub>..) is when a<sub>1</sub> = a<sub>2</sub> = ...
  <br/> Problem: [SubdividedSlimes](https://community.topcoder.com/stat?c=problem_statement&pm=14059)
