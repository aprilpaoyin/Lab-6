__author__ = 'd14124009'

def gcd(a, b):
    #finds gcd of 2 numbers
    if a < b:
        #swaps a and b so that a > b
        a, b = b, a

    while b != 0:
        a, b = b, a%b

    return a

def lcm(a, b):
    return a*b//gcd(a, b,)



str_a = input("Enter a number")
a = float(str_a)

str_b = input("Enter another number")
b = float(str_b)

deeznutz = gcd(a, b)
twonutz5you = lcm(a, b)

print("The gcd of", a, "and", b, "is", deeznutz)
print("The lcm is", twonutz5you)



