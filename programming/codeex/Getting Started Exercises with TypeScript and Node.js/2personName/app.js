"use strict";
let personName = '';
personName = prompt("enter your personal name: ?") || '';
if (personName !== null && personName !== '') {
    alert(`Hello ${personName}, would you like to learn some Python today?`);
}
else {
    alert("entervyour name only");
}
