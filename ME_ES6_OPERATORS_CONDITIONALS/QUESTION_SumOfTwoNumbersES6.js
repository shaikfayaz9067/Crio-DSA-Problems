/**
 * @param {number} a
 * @param {number} b
 * @return {number}
 */
function sumOfTwoNumbers(a, b) {
    var sum=a+b;
    return sum;
    // You only need to implement this function.
}

if (sumOfTwoNumbers(1,2) !== 3)
    console.log("Test fails: Expected 3 for input a = 1 and b = 2");
else
    console.log("Sample test case for input a = 1 and b = 2 passed!");

module.exports = sumOfTwoNumbers;

