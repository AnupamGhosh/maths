def factors(no):
    factor = 1
    while factor * factor < no:
        if no % factor == 0:
            yield factor
            yield no / factor
        factor += 1
    
    if factor * factor == no:
        yield factor
        
print sorted(factor for factor in factors(input()))
