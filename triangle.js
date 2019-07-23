const tri = function(a,b,c){
    if(a + b <= c || a + c <= b || b + c <= a || a<0 || b<0 || c<0){
        console.log("Not a triangle")
    }
    else if(a == b && b==c){
        console.log("Equilateral")
    }
    else if(a == b || b==c || a==c){
        console.log("Isosceles")
    }
    else {
        console.log("Scalene")
    }
}

tri(2,2,5)
tri(4,3,3)
tri(3,3,4)
tri(3,4,3)
tri(1,0,1)
tri(0,0,5)
tri(0,0,0)
tri(5,-1,3)
tri(0,0,5)
tri(1,2,3)
tri(2,1,3)
tri(3,2,1)