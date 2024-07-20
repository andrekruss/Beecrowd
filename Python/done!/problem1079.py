def parse_input(input: str) -> tuple:
    values_list = input.split(" ")
    values = (
        float(values_list[0]),
        float(values_list[1]),
        float(values_list[2])
    )
    return values

n = int(input())

for i in range(0, n):
    raw_input = input()
    x1, x2, x3 = parse_input(raw_input)
    weighted_avg = (2 * x1 + 3 * x2 + 5 * x3) / 10
    print(f"{weighted_avg:.1f}")

