def is_even(n: int) -> bool:
    return n % 2 == 0

n = int(input())

for i in range(0, n):

    x = int(input())

    if (x > 0 and is_even(x)):
        print("EVEN POSITIVE")
    elif (x < 0 and is_even(x)):
        print("EVEN NEGATIVE")
    elif (x > 0 and (not is_even(x))):
        print("ODD POSITIVE")
    elif (x < 0 and (not is_even(x))):
        print("ODD NEGATIVE")
    else:
        print("NULL")