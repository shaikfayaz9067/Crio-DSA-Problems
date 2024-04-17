/**
 * @param {number} n
 * @return {boolean}
 */


function checkForPrime(n) {
  for(let i=2;i<n;i++){
    if(n%i==0){
      return false;
    }

  }
  return true;
  // You only need to implement this function.
}

if (checkForPrime(11) !== true)
  console.log("Test fails: Expected true for input n = 11");
else
  console.log("Sample test case for input n = 11 passed!");

module.exports = checkForPrime

