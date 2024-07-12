def is_odd(n: int) -> bool:
    return (n % 2 != 0)

sum: int = 0
n1: int = int(input())
n2: int = int(input())

if n1 < n2:
    for i in range(n1 + 1, n2 - 1):
        if is_odd(i):
            sum += i
elif n1 > n2:
    n1 -= 1
    while(n1 > n2):
        if is_odd(n1):
            sum += n1
        n1 -= 1
        
print(sum)