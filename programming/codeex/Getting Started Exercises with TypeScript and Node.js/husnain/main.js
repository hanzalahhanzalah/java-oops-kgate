var arr = [1, 2, 3, 4];
console.log(arr);
var x = arr.map(mul);
function mul(item) {
    return item * 2;
}
console.log(x);
