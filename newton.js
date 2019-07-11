const f = function (x) {
    const value = 8-(4.5*(x-Math.sin(x)))
    return value
}

const p = function(x){
    const value = -4.5*(1-Math.cos(x))
    return value
}

let x = [];
x.push(2);

let i;

for(i=0;i<2;i++){

    const temp = x[i] - (f(x[i]) / p(x[i]))
    x.push(temp)
    
}

console.log(x)



