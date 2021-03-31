"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
//// Assignment1
//Q1
console.log("Question 1\n");
var q1 = 20;
console.log(q1);
//if we create a new variable with same name as defined
var q1 = 10; // this will show an of redclaring the variable because we have created a variable with constant keyword previously with same name
console.log();
//Q2
console.log("Question 2\n");
var q2 = 10;
if (q2 > 0) {
    var b = 8;
    console.log(q2, b);
}
console.log(b); // here i am printing the value of b variable but it is showing error bcz the scope of b variable is inside the if function
console.log();
//Q3
console.log("Question 3\n");
var object = {
    "id": 123,
    "title": "Car",
    'price': 100,
    printOrder: function () {
        console.log("The Order Id is: " + this.id);
        console.log("The title of the order is: " + this.title);
    },
    getPrice: function () {
        console.log("The price of the order is: " + this.price);
    }
};
console.log(object.printOrder(), object.getPrice());
console.log();
//Q4
console.log("Question 4\n");
var khali = [];
var names = ["Tom", "Ivan", "Jerry"];
var xyz = function (names) {
    for (var i in names) {
        var z = "{" + "names: " + names[i] + ",length: " + names[i].length + "}";
        khali.push(z);
    }
};
console.log(khali);
console.log();
//Q5
console.log("Question 5\n");
//Part 1
console.log("Part 1 of Question 5\n");
var var1, var2;
function add(var1, var2) {
    if (var1 === void 0) { var1 = 10; }
    if (var2 === void 0) { var2 = 20; }
    return var1 + var2;
}
console.log(add());
console.log();
//Part2
console.log("Part 2 of Question 5\n");
var userName = "UnderTaker";
var usr_friends = ["Kane", "Daniel", "Cobra"];
function userFriends(userName) {
    var usr_friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        usr_friends[_i - 1] = arguments[_i];
    }
    console.log("The nain leader is: " + userName + "\n the Friends is: ");
    for (var i in usr_friends) {
        console.log(usr_friends[i]);
    }
}
console.log(userFriends(userName, usr_friends));
console.log();
//Part3
console.log("Part 3 of Question 5\n");
var fiveNames = ["Sova", "Skye", "Brimstone", "Reyna", "Omen"];
function capitalNames() {
    var fiveNames = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        fiveNames[_i] = arguments[_i];
    }
    for (var i in fiveNames) {
        console.log(fiveNames[i].toUpperCase());
    }
}
console.log(capitalNames.apply(void 0, fiveNames));
console.log();
//Q6
console.log("Question 6\n");
var lap_model = "Razer Nikal";
var desktop_No = 1221;
var urName = "Johhny Bhaiya";
console.log("The Name of the Customer is: " + urName + "\nThe Desktop Number of the Customer is: " + desktop_No + "\nand The Laptop model of the Customer laptop is: " + lap_model);
console.log();
//Q7
console.log("Question 7\n");
// 1st part
console.log("Part 1 of Question 7\n");
var javaScript = ["Yellow", "Green", "Blue", "Red"];
var thirdElement = javaScript[2];
console.log("The third element of the array is: " + thirdElement);
//2nd part
console.log("Part 2 of Question 7\n");
var pinObject = {
    name: "Johhny bhaiya",
    address: {
        street: "XYZ",
        city: "Mirjapur",
        pincode: 212121,
        state: "UP",
        country: "INDIA"
    }
};
var pincode = pinObject.address.pincode;
console.log("The Pincode of city is: " + pincode);
console.log();
//Q8
console.log("Question 8");
var Account = /** @class */ (function () {
    function Account(accountId, accountName, accountBalance) {
        console.log(accountId, accountName, accountBalance);
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(interest, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(cash_credit, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    return CurrentAccount;
}(Account));
var ac = new SavingAccount(10, 123, "asasd", 3000);
console.log(ac);
