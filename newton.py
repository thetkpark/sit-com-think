import math

def f(x):
    value = 8-(4.5*(x-math.sin(x)))
    return value

def p(x):
    value = -4.5*(1-math.cos(x))
    return value

x = [2]

for i in range(2):

    temp = x[i] - (f(x[i]) / p(x[i]))
    x.append(temp)

print(x)