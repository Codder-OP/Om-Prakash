export{}
let message='asdf';
console.log(message);
enum Colour {Red=5, Green=1, White};
let c: Colour=Colour.Red;
console.log(c);


function add(num1: number,num2: number=9): number{
    return (num1+num2);
}
console.log(add(5));

const as=()=>  10;
console.log(as());
console.log(typeof as);

function displayColor(...color){
    for(let i in color){
        console.log(color[i]);
    }
}
let colorArray=['orange','yellow','black'];
displayColor(...colorArray);

let f='chandler';
let x='bing';

let z={
    f,
    x
};
console.log(z.f,z.x);
console.log();

let aa='chandler';
let b=`welcome ${aa} to nikal`;
console.log(b);


let modu=["as","df","gh"];
let [fa,fz,fq]=modu;
console.log(fa,fz,fq);



