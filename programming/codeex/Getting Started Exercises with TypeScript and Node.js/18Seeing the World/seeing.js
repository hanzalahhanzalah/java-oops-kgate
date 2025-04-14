var places = ['baitul_maqdis', 'bejing', 'tehran', 'california', 'makkah'];
// Print the array in its original order.
console.log('Original Order:', places);
// Print the array in alphabetical order without modifying the actual list.
var sortedArray = places.slice().sort();
console.log('Alphabetical Order:', sortedArray);
// Show that the array is still in its original order by printing it.
console.log('Original Order:', places);
// Print the array in reverse alphabetical order without changing the order of the original list.
var reversedArray = places.slice().sort().reverse();
console.log('Reverse Alphabetical Order:', reversedArray);
// Show that the array is still in its original order by printing it again.
console.log('Original Order:', places);
// Reverse the order of the list.
console.log('Reversed Order:', places.reverse());
// Reverse the order of the list again.
console.log('Reversed Order Again:', places.reverse());
// Sort the array in alphabetical order. Print the array to show the order has changed.
console.log('Sorted in Alphabetical Order:', places.sort());
// Sort to change the array to reverse alphabetical order. Print the list to show the order has changed.
console.log('Sorted in Reverse Alphabetical Order:', places.sort().reverse());
