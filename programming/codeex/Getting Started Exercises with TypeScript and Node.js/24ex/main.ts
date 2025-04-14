// More Conditional Tests: You don’t have to limit the number of tests you create to 10. If you want to try more comparisons, write more tests. Have at least one True and one False result for each of the following:
// • Tests for equality and inequality with strings


// • Tests using the lower case function

// • Numerical tests involving equality and inequality, greater than and less than, greater than or equal to, and less than or equal to

// • Tests using "and" and "or" operators

// • Test whether an item is in a array

// • Test whether an item is not in a array

// Tests for equality and inequality with strings
console.log("hello" === "hello"); // true
console.log("hell" !== "hell"); //false

// Lowercase function
console.log("HELLO".toLowerCase() === "hello"); // true
console.log("World".toLowerCase() === "world"); // true
// Numerical tests
let x: number = 17;
let y: number = 18;

// Equality and inequality
console.log(x === y); // false
console.log(x !== y); // true

// Greater than and less than
console.log(x > y); // false
console.log(x < y); // true

// Greater than or equal to and less than or equal to
console.log(x >= y); // false
console.log(x <= y); // true

//operators
let ali_is_adult:Boolean=true
let ali_age:number=18
console.log(ali_is_adult==true && ali_age==18)//true
console.log(ali_is_adult==true || ali_age==21)//true
//weather in array or not

let colors:string[]=['violet','blue','green']
console.log(colors.includes('green')) //true
console.log(!colors.includes('pink')) //true