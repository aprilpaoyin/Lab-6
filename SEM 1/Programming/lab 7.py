__author__ = 'd14124009'

def gcd(a, b):
    #finds gcd of 2 numbers
    if a < b:
        #swaps a and b so that a > b
        a, b = b, a

    while remainder != 0:
        remainder = a % b
        if remainder == 0:
            break



str_a = input("Enter a number")
a = int(str_a)

str_b = input("Enter another number")
b = int(str_b)

remainder = gcd(a, b)

print("The gcd of", a, "and", b, "is", remainder)