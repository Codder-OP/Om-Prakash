export{}

                                //// Assignment1
        

//Q1
console.log("Question 1\n");
const q1=20;
console.log(q1);

    //if we create a new variable with same name as defined
const q1=10; // this will show an of redclaring the variable because we have created a variable with constant keyword previously with same name

console.log();

//Q2
console.log("Question 2\n");
var q2=10
if(q2>0){
    let b =8;
    console.log(q2,b);
    
}
console.log(b);  // here i am printing the value of b variable but it is showing error bcz the scope of b variable is inside the if function

console.log();

//Q3
console.log("Question 3\n");
let object={
    "id": 123,
    "title": "Car",
    'price': 100,
    printOrder(){
       console.log("The Order Id is: "+this.id);
       console.log("The title of the order is: "+this.title);
       
        
    },
    getPrice(){
        console.log("The price of the order is: "+this.price);
        
        
    }
};
console.log(object.printOrder(),object.getPrice());

console.log();

//Q4
console.log("Question 4\n");
let khali=[];
let names = ["Tom", "Ivan", "Jerry"];
var xyz=(names)=>{
    for(let i in names){
        let z="{"+"names: "+names[i]+",length: "+names[i].length+"}";
        khali.push(z);
    } 
};
console.log(khali);
console.log();

//Q5
console.log("Question 5\n");

//Part 1
console.log("Part 1 of Question 5\n");
let var1,var2;
function add(var1=10,var2=20){
    return var1+var2;
}
console.log(add());

console.log();

//Part2
console.log("Part 2 of Question 5\n");
let userName="UnderTaker";
let usr_friends=["Kane","Daniel","Cobra"];
function userFriends(userName, ...usr_friends){
    console.log("The nain leader is: "+userName +"\n the Friends is: ");
    for(let i in usr_friends){
        
        console.log(usr_friends[i]);
        
        
    }
}
console.log(userFriends(userName,usr_friends));
 
console.log();

//Part3
console.log("Part 3 of Question 5\n");

let fiveNames=["Sova","Skye","Brimstone","Reyna","Omen"];
function capitalNames(...fiveNames){
    for (let i in fiveNames) {
        
        console.log(fiveNames[i].toUpperCase());
    }
}
console.log(capitalNames(...fiveNames));

console.log();


//Q6
console.log("Question 6\n");

let lap_model="Razer Nikal";
let desktop_No=1221;
let urName="Johhny Bhaiya";
console.log(`The Name of the Customer is: ${urName}
The Desktop Number of the Customer is: ${desktop_No}
and The Laptop model of the Customer laptop is: ${lap_model}`);

console.log();


//Q7
console.log("Question 7\n");
// 1st part
console.log("Part 1 of Question 7\n");
let javaScript=["Yellow","Green","Blue","Red"];
let [, , thirdElement,]=javaScript;
console.log("The third element of the array is: "+thirdElement);

//2nd part
console.log("Part 2 of Question 7\n");
let pinObject={
    name: "Johhny bhaiya",
    address:{
        street: "XYZ",
        city: "Mirjapur",
        pincode: 212121,
        state: "UP",
        country: "INDIA"
    }
};
let { address:{pincode}}=pinObject; 
console.log("The Pincode of city is: "+pincode);
console.log();

//Q8
console.log("Question 8");

class Account{
     constructor(accountId,accountName,accountBalance){
        
         console.log(accountId,accountName,accountBalance);
         
     }
     
     
}
class SavingAccount extends Account{
    constructor(interest,accountId,accountName,accountBalance){
        super(accountId,accountName,accountBalance);
    }
}
class CurrentAccount extends Account{
    constructor(cash_credit,accountId,accountName,accountBalance){
        super(accountId,accountName,accountBalance);
    }
}

let ac =new SavingAccount(10,123,"asasd",3000);
console.log(ac);


