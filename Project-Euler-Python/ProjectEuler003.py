import math

n = 600851475143
x = []

while n % 2 == 0:
    x.append(2)
    n = n / 2

for i in range(3, int(math.sqrt(n)) + 1, 2):
    while n % i == 0:
        x.append(i)
        n = n / i

if n > 2:
    x.append(n)

print(x[-1])