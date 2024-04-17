/**
 * @param {number} r
 * @return {string}
 */


function circleValues(r){
  return `A circle of radius ${r} has a diameter ${2*r}`;
  // You only need to implement this function.
}

if (circleValues(2) !== "A circle of radius 2 has a diameter 4")
  console.log("Test fails: Expected 'A circle of radius 2 has a diameter 4' for input r = 2");
else
  console.log("Sample test case for input r = 2 passed!");

module.exports = circleValues

