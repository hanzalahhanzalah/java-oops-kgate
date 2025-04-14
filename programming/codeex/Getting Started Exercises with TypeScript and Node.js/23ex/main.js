"use strict";
let iphone_price = 400000;
console.log("Is iphone_price == '400000'? "); //true
console.log(iphone_price == 400000);
console.log(10 > 9.9); //true
let amar_is_good_student = false;
console.log(amar_is_good_student == false); //true
amar_is_good_student = true;
console.log(amar_is_good_student); //true
let amar_age = 8;
if (amar_is_good_student == true && amar_age == 8) // true
 {
    console.log(true);
}
else
    console.log(false);
//now false conditions
console.log(1000 < 960); //false
let ali = { fname: 'umer' }; //false
if (ali.fname == 'sadiq') {
    console.log(true);
}
else
    console.log(false);
let ali_is_adult = false; //false
if (ali_is_adult == false) {
    console.log(false);
}
else
    console.log(true);
let ali_age = 11;
console.log(ali_age == 11.3); //false
if (ali_age == 11.3) {
    console.log(true);
} //false
else
    console.log(false);
