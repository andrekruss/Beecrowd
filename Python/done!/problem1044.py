a, b = map(lambda x : int(x), input().split(" "))

if (a > b):
    if (a % b == 0):
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")
else:
    if (b % a == 0):
        print("Sao Multiplos")
    else:
        print("Nao sao Multiplos")