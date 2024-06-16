# Check if n is palindrome
def is_palindrome(n):
    n = str(n)
    reverse_n = n[::-1]
    if n == reverse_n:
        return True
    return False


answer = 0
for i in range(999, 99, -1):
    for j in range(999, 99, -1):
        product = i * j
        if is_palindrome(product) and product > answer:
            answer = product

print(answer)
