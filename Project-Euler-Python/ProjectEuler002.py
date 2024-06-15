Fs = [0, 1]

while Fs[-1] < (4 * 10 ** 6):
    x = Fs[-1] + Fs[-2]
    Fs.append(x)
    if Fs[-1] > (4 * 10 ** 6):
        Fs.pop()
        break

print(Fs)

Final = []
for i in Fs:
    if i % 2 == 1:
        Final.append(i)
print(Final)

f = 0
for i in Final:
    f += i

print(f)