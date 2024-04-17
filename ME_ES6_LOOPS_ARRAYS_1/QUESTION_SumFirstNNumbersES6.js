/**
 * @param {number} n
 * @return {number}
 */


function findSumOfFirstN(n){
  // You only need to implement this function.
  let sum=0;
  for(let i=0;i<=n;i++){
    sum=sum+i;
  }
  return sum;
}

if (findSumOfFirstN(3) !== 6)
  console.log("Test fails: Expected 6 for input n = 3");
else
  console.log("Sample test case for input n = 3 passed!");


module.exports = findSumOfFirstN

