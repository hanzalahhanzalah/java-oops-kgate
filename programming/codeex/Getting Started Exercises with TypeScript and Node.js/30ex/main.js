// Hello Admin: Make a array of five or more usernames, including the name 'admin'.
//  Imagine you are writing code that will print a greeting to each user after they log in to a website.
//   Loop through the array, and print a greeting to each user:
// • If the username is 'admin', print a special greeting, such as Hello admin, would you like to see a status report?
// • Otherwise, print a generic greeting, such as Hello Eric, thank you for logging in again.
var usernames = ['admin', 'hanzalah', 'farwa', 'benjamin', 'sara'];
// if (usernames.includes('admin'))
//         console.log(`Hello admin, would you like to see a status report?
//         `)
var i = 0;
while (i < usernames.length) {
    if (usernames[i] == "admin") {
        console.log("Hello admin, would you like to see a status report?\n        ");
    }
    else
        console.log(" Hellow ".concat(usernames[i], ", thank you for logging in again. "));
    i++;
}
