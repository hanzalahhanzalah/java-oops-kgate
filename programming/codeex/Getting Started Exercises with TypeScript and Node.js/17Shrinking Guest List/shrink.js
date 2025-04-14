"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.functionFromProgram19 = void 0;
var guest = ['hitler', 'berlin', 'undertaker', 'sultan hameed'];
var greet = ("I would like to invite you to dinner at my place this Saturday evening from [hanzalah]");
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }
var absentGuest = 'hitler';
var newGuest = 'tommy';
guest[0] = 'tommy';
console.log("now printing new list");
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }
console.log("".concat(absentGuest, " is the absent guest\nand the new guest is ").concat(newGuest));
console.log("Congratulation we got bigger table now we are inviting 3 more guests");
guest.unshift('helsinki');
guest.splice(3, 0, 'Zubair');
guest.push('asim munir');
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }
console.log("I can invite only two people for dinner.");
while (guest.length > 2) {
    var removeGuest = guest.pop() || '';
    console.log("Sorry Mr  ".concat(removeGuest, " , you are not invited for dinner!"));
}
for (var i = 0; i < guest.length; i++) {
    console.log('Dear MR. ' + '\n' + guest[i] + ' \n\n' + 'You are still invited for dinner' + '\n');
}
guest.splice(0, 2);
console.log(guest);
// main_folder/folder90/program19.ts
function functionFromProgram19() {
    console.log("Function from program19 in folder90");
}
exports.functionFromProgram19 = functionFromProgram19;
