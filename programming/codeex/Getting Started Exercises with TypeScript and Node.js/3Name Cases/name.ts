

let personName: string = '';
personName = prompt("Enter your name") || '';

if (personName !== null && personName !== '') {
    let lowerCase: string = personName.toLowerCase();
    let upperCase: string = personName.toUpperCase();
    let titleCase: string = personName.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1).toLowerCase()).join(' ');

    alert(`Here is your name in lower case: ${lowerCase},
Here is your name in upper case: ${upperCase},
Here is your name in title case: ${titleCase}`);
} else {
    alert("Enter correct name");
}
