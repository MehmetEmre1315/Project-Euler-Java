dividerLimit = 20
x = 1
ans = int
tallyCounter = list()

while True:
    for i in range(1, dividerLimit + 1):
        if x % i == 0:
            tallyCounter.append(i)
        else:
            tallyCounter.clear()
            break

    if len(tallyCounter) == dividerLimit:
        print("Answer: ", x)
        ans = x
        break
    x += 1
