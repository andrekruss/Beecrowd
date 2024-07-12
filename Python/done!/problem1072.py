n: int = int(input())
in_counter: int = 0
out_counter: int = 0

for i in range(1, n + 1):

    x: int = int(input())

    if x >= 10 and x <= 20:
        in_counter += 1
    else:
        out_counter += 1

print(f"{in_counter} in")
print(f"{out_counter} out")
