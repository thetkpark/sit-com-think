import math

def f(x):
    value = 8-(4.5*(x-math.sin(x)))
    return value

def p(x):
    value = -4.5*(1-math.cos(x))
    return value

x = [2]
i = 0
while 1:
    temp = x[i] - (f(x[i]) / p(x[i]))
    x.append(temp)
    if(abs(x[i] - x[i+1]) == 0):
        break
    i = i+1
    
print(x[i+1])