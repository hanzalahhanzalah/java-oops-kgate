"use strict";
let guest = ['hitler', 'berlin', 'undertaker', 'sultan hameed'];
let greet = ("I would like to invite you to dinner at my place this Saturday evening from [hanzalah]");
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }
let absentGuest = 'hitler';
let newGuest = 'tommy';
guest[0] = 'tommy';
console.log("now printing new list");
for (let i = 0; i < guest.length; i++) {
    console.log('Dear MR. ' + '\n' + guest[i] + ' \n\n' + greet + '\n');
}
console.log(`${absentGuest} is the absent guest\nand the new guest is ${newGuest}`);
console.log("Congratulation we got bigger table now we are inviting 3 more guests");
guest.unshift('helsinki');
guest.splice(3, 0, 'Zubair');
guest.push('asim munir');
for (let i = 0; i < guest.length; i++) {
    console.log('Dear MR. ' + '\n' + guest[i] + ' \n\n' + greet + '\n');
}
