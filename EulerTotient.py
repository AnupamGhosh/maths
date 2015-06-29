def totient(L, primes):
    '''phi(n) = n(1-1/p1)(1-1/p2)..(1-1/pk) p1,p2...pk prime factors of n'''
    phi = [n for n in range(L+1)]
    for p in primes:
        for n in range(p, L+1, p):
            phi[n] -= phi[n] / p
    return phi
