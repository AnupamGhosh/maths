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
