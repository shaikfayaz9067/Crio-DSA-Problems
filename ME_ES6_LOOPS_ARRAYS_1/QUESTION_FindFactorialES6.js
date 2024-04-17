/**
 * @param {number} n
 * @return {number}
 */


function findFactorial(n) {
  // You only need to implement this function.
  let fact=1;
  let i=1;
  while(i<=n){
    fact=fact*i;
    i++;
  }
  return fact;
}

if (findFactorial(4) !== 24)
  console.log("Test fails: Expected 24 for input n = 4");
else
  console.log("Sample test case for input n = 4 passed!");

module.exports = findFactorial

