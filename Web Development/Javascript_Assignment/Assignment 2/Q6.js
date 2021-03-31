var arr = [1, 2, 3, 4, 5];
function square(arr) {
   var result=[].concat(arr);
   result.forEach(function(i){
      n=i*i;
      console.log(n);
   })
   return result;
 }
function square1(arr) {
   var result1=[].concat(arr);
   result1.forEach(function(i){
      n=i^0.5;
      console.log(n);
   })
   return result1;
 }

console.log(square(arr));
console.log(square1(arr));
