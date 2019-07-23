def sumRange(a,b):
    low = int(input("Lowerbound: "))
    up = int(input("Upperbound: "))
    
    result = 0
    for x in range(low,up+1):
        result+=x
    return result

print(sumRange(1,100))
