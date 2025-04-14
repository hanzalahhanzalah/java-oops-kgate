var personName = '';
personName = prompt("Enter your name") || '';
if (personName !== null && personName !== '') {
    var lowerCase = personName.toLowerCase();
    var upperCase = personName.toUpperCase();
    var titleCase = personName.split(' ').map(function (word) { return word.charAt(0).toUpperCase() + word.slice(1).toLowerCase(); }).join(' ');
    alert("Here is your name in lower case: ".concat(lowerCase, ",\nHere is your name in upper case: ").concat(upperCase, ",\nHere is your name in title case: ").concat(titleCase));
}
else {
    alert("Enter correct name");
}
