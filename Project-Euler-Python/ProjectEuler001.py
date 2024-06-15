a = list(range(1,1000))
b = []
c = 0

for i in a:
    if i % 3 == 0:
        b.append(i)
        continue
    if i % 5 == 0:
        b.append(i)

for i in b:
    c += i

print(c)
