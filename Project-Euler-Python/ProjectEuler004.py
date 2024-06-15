a = list(range(10, 100))
b = list(range(10, 100))

c = 0

for x in range(len(a) - 1):
    for y in range(len(b) - 1):
        c = a[x] * b[y]

        print(c)
print(a[len(a) - 1])