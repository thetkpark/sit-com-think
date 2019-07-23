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

let i=0;

while(1){
    
    const temp = x[i] - (f(x[i]) / p(x[i]))
    x.push(temp)
    
    if(Math.abs(x[i]) - Math.abs(x[i+1]) == 0) break;
    i++;
}

console.log(x[i+1])

