no = input()
def primefactors(no):
    factor = 2
    while factor * factor <= no:
        if no % factor == 0:
            e = 0
            while no % factor == 0:
                no /= factor
                e += 1
            yield factor, e
        factor += 1
    if no > 1:
        yield no, 1
print [factor for factor in primefactors(no)]

#Use following when no <= 10**6, cost O(log N)
N = 10**6 + 1
minPrime = [0] * N
i = 2
while i * i <= N:
    if minPrime[i] == 0:
        for j in xrange(i * i, N, i):
            minPrime[j] = i
    i += 1

for i in xrange(2, N):
    if minPrime[i] == 0:
        minPrime[i] = i

def factorize(n):
    factors = []
    while n != 1:
        factors.append(minPrime[n])
        n /= minPrime[n]
    return factors

print factorize(720)
