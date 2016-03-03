__author__ = 'd14124009'

import math

num_str = input("please enter a number:")
number = int(num_str)
binary_str = ""

if number < 0:
    print("negative number")
elif number == 0:
    print("number is 0")
else:
    while number > 0:
        bit = number % 2
        quotient = number // 2
        remainder_str = str(bit)
        binary_str = remainder_str + binary_str
        number = quotient

print(binary_str)
