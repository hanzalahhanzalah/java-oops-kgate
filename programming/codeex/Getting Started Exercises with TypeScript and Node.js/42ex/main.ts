// Great Magicians: Start with a copy of your program from Exercise 39. 
// Write a function called make_great() that modifies the array of magicians by 
// adding the phrase the Great to each magician’s name.
//  Call show_magicians() to see that the list has actually been modified.
 

let magician_names: string[] = ['badshah sarkar', 'dare devil', 'jhony'];

function show_magicians(names: string[]): void {
    for (let name of names) {
        console.log(name);
    }
}



 function make_great(greet:string[]):string[]{
for (let egreet of greet) {

egreet=(`welcome MR. ${egreet} it's my pleasure to meet you`)
}
return greet;
 }

 
 magician_names=make_great(magician_names);
 show_magicians(magician_names);