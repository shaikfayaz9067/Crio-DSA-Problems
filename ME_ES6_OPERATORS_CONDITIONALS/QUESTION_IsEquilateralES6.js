/**
 * @param {number} side1
 * @param {number} side2
 * @param {number} side3
 * @return {boolean}
 */

function isEquilateralType(side1, side2, side3) {
    if(side1===side2 && side2===side3){
        return true;
    }
    return false;
    // You only need to implement this function.
}

if (isEquilateralType(1, 1, 1) !== true)
    console.log("Test fails: Expected true for input side1 = 1, side2 = 1 and side3 = 1");
else
    console.log("Sample test case for input side1 = 1, side2 = 1 and side3 = 1 passed!");

module.exports = isEquilateralType;

