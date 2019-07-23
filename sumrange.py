def sumRange(low,up):
    
    result = 0
    for x in range(low,up+1):
        result+=x
    return result


low = int(input("Lowerbound: "))
up = int(input("Upperbound: "))
print(sumRange(low,up))
