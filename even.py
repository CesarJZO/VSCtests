import math
# This is a comment
def is_even(n):
    if n % 2 == 0:
        print(f'{n} is even')
    else:
        print(f'{n} is odd')

list = [5, 4, 8, 3, 2, 1]

print(list)
for i in list:
    is_even(i)

x = int(input('Number: '))
y = int(math.sqrt(x))
print(f'The square root of {x} is {y}')