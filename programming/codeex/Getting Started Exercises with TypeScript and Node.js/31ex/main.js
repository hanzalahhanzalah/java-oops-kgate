"use strict";
// No Users: Add an if test to Exercise 28 to make sure the list of users is not empty.
// • If the list is empty, print the message We need to find some users!
Object.defineProperty(exports, "__esModule", { value: true });
// • Remove all of the usernames from your array, and make sure the correct message is printed.
var usernames = ['admin', 'hanzalah', 'farwa', 'benjamin', 'sara'];
if (usernames.length === 0) {
    console.log("We need to find some users!");
}
else {
    var i = 0;
    while (i < usernames.length) {
        if (usernames[i] == "admin") {
            console.log("Hello admin, would you like to see a status report?\n        ");
        }
        else
            console.log(" Hellow ".concat(usernames[i], ", thank you for logging in again. "));
        i++;
    }
}
usernames = [];
if (usernames.length === 0) {
    console.log("We need to find some users!");
}
