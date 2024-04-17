/**
 * @param {number} a
 * @return {number}
 */
function findCube(a) {
    // You only need to implement this function.
    var cube=a*a*a;
    return cube;
}


if (findCube(2) !== 8)
    console.log("Test fails: Expected 8 for input a = 2");
else
    console.log("Sample test case for input a = 2 passed!");


module.exports = findCube;

