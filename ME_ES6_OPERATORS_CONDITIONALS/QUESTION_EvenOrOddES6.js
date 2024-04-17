/**
 * @param {number} num
 * @return {string}
 */

function evenOrOdd(num) {
    if(num%2==0){
        return "Even"
    }
    return "Odd";
    // You only need to implement this function.
}

if (evenOrOdd(2) !== "Even")
    console.log("Test fails: Expected Even for input num = 2");
else
    console.log("Sample test case for input num = 2 passed!");

module.exports = evenOrOdd;

