"use strict";
exports.__esModule = true;
var message = 'asdf';
console.log(message);
var Colour;
(function (Colour) {
    Colour[Colour["Red"] = 5] = "Red";
    Colour[Colour["Green"] = 1] = "Green";
    Colour[Colour["White"] = 2] = "White";
})(Colour || (Colour = {}));
;
var c = Colour.Red;
console.log(c);
function add(num1, num2) {
    if (num2 === void 0) { num2 = 9; }
    return (num1 + num2);
}
console.log(add(5));
var as = function () { return 10; };
console.log(as());
console.log(typeof as);
function displayColor() {
    var color = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        color[_i] = arguments[_i];
    }
    for (var i in color) {
        console.log(color[i]);
    }
}
var colorArray = ['orange', 'yellow', 'black'];
displayColor.apply(void 0, colorArray);
var f = 'chandler';
var x = 'bing';
var z = {
    f: f,
    x: x
};
console.log(z.f, z.x);
console.log();
var aa = 'chandler';
var b = "welcome " + aa + " to nikal";
console.log(b);
var modu = ["as", "df", "gh"];
var fa = modu[0], fz = modu[1], fq = modu[2];
console.log(fa, fz, fq);
