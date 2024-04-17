/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {boolean}
 */

function compareNumbers(a, b, c) {
    if(a===b){
        return true;
    }
    else if(b===c){
        return true;
    }
    else if(a===c){
        return true;
    }
    else{
        return false;
    }
    // You only need to implement this function.
}

if (compareNumbers(1, 1, 2) !== true)
    console.log("Test fails: Expected true for input a = 1, b = 1 and c = 2");
else
    console.log("Sample test case for input a = 1, b = 1 and c = 2 passed!");

module.exports = compareNumbers;

