let guest:string[]=['hitler','berlin','undertaker','sultan hameed'];
let greet:string=("I would like to invite you to dinner at my place this Saturday evening from [hanzalah]");
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }

let absentGuest:string='hitler';
let newGuest:string='tommy';

guest[0]='tommy';
console.log("now printing new list");
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }

console.log(`${absentGuest} is the absent guest\nand the new guest is ${newGuest}`);

console.log("Congratulation we got bigger table now we are inviting 3 more guests")
guest.unshift('helsinki')
guest.splice(3,0 ,'Zubair')
guest.push('asim munir')
// for(let i=0; i < guest.length;i++){
//     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  greet + '\n');
// }
console.log("I can invite only two people for dinner.")
while(guest.length>2){
let removeGuest:string=guest.pop() ||'';
console.log(`Sorry Mr  ${removeGuest} , you are not invited for dinner!`)
}
for(let i=0; i < guest.length;i++){
     console.log('Dear MR. '+'\n' + guest[i]+' \n\n' +  'You are still invited for dinner' + '\n');
 }
guest.splice(0,2);
console.log(guest);
// main_folder/folder90/program19.ts
export function functionFromProgram19() {
    console.log("Function from program19 in folder90");
}
