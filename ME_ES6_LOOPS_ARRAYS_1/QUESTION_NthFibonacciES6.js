/**
 * @param {number} n
 * @return {number}
 */


function findFibonacci(n) {
  // You only need to implement this function.
  if(n===0){
    return 0;
  }
  if(n===1){
    return 1;
  }
  return findFibonacci(n-1)+findFibonacci(n-2);

  }


if (findFibonacci(5) !== 5)
  console.log("Test fails: Expected 5 for input n = 5");
else
  console.log("Sample test case for input n = 5 passed!");

module.exports = findFibonacci

