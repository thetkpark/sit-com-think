const f = function (x) {
    const value = 8-(4.5*(x-Math.sin(x)))
    return value
}

const calXNS = function(x,y) {
    return (x+y)/2
}

let a=2,b=3;
let xns = calXNS(a,b)
let i=0;
if(f(a)*f(b)<0){
    for(i=0;i<10;i++){
        if(f(a)*f(xns) < 0){
            b = xns;
            xns = calXNS(a,b)
        }
        else if(f(a)*f(xns)>0){
            a = xns
            xns = calXNS(a,b)
        }
    }
}

console.log(xns);
