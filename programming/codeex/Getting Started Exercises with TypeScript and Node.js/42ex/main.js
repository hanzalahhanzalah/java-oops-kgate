// Great Magicians: Start with a copy of your program from Exercise 39. 
// Write a function called make_great() that modifies the array of magicians by 
// adding the phrase the Great to each magician’s name.
//  Call show_magicians() to see that the list has actually been modified.
var magician_names = ['badshah sarkar', 'dare devil', 'jhony'];
function show_magicians(names) {
    for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
        var name_1 = names_1[_i];
        console.log(name_1);
    }
}
function make_great(greet) {
    for (var _i = 0, greet_1 = greet; _i < greet_1.length; _i++) {
        var egreet = greet_1[_i];
        egreet = ("welcome MR. ".concat(egreet, " it's my pleasure to meet you"));
    }
    return greet;
}
magician_names = make_great(magician_names);
show_magicians(magician_names);
