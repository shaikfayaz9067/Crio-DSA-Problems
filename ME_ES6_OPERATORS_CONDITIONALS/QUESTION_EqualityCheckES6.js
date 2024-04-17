/**
 * @param {number} a
 * @param {number} b
 * @return {boolean}
 */

function isEqual(a, b) {
    if(a===b){
        return true;
    }
    else{
        return false;
    }
    // You only need to implement this function.
}

if (isEqual(3,3) !== true)
    console.log("Test fails: Expected true for input a = 3 and b = 3");
else
    console.log("Sample test case for input a = 3 and b = 3 passed!");


module.exports = isEqual;

