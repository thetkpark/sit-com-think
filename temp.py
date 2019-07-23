side1 = int(input())
side2 = int(input())
side3 = int(input())

if(side1 == side2 & side2 == side3):
    print("Equilateral")
else if(side1 == side2 | side2 == side3 | side1 == side3):
    print("Isosceles")
else:
    print("Scalene")


