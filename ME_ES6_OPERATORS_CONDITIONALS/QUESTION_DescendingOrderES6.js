/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {boolean}
 */
function isDescending(a, b, c) {
    if(a>b&& b>c){
        return true;
    }else {
        return false;
    }    // You only need to implement this function.
}

if (isDescending(3, 2, 1) !== true)
    console.log("Test fails: Expected true for input a = 3, b = 2 and c = 3");
else
    console.log("Sample test cases for input a = 3, b = 2 and c = 1 passed!");

module.exports = isDescending;

