// Checking Usernames: Do the following to create a program that simulates
//  how websites ensure that everyone has a unique username.
// • Make a list of five or more usernames called current_users.
// • Make another list of five usernames called new_users.
//  Make sure one or two of the new usernames are also in the current_users list.
// • Loop through the new_users list to see if each new username has already been used. 
// If it has, print a message that the person will need to enter a new username. If a username has not been used,
//  print a message saying that the username is available.
// Checking Usernames
var current_users = ['Jhon', 'tokyo', 'alex', 'Alias', 'Modi'];
var new_users = ['jhon', 'moranda', 'yasir', 'alias', 'modi'];
var current_users_lower = current_users.map(function (item) { return item.toLowerCase(); });
var new_users_lower = new_users.map(function (item) { return item.toLowerCase(); });
for (var _i = 0, new_users_lower_1 = new_users_lower; _i < new_users_lower_1.length; _i++) {
    var user = new_users_lower_1[_i];
    if (current_users_lower.includes(user)) {
        console.log("The username '".concat(user, "' is not available. Please enter a new username."));
    }
    else {
        console.log("The username '".concat(user, "' is available."));
    }
}
