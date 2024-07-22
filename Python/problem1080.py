highest_value = int(input())
pos = 1

for i in range(2, 101):
    new_value = int(input())
    if new_value > highest_value:
        highest_value = new_value
        pos = i

print(highest_value)
print(pos)