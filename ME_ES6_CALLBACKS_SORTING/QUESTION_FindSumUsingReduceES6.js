/**
 * @param {number[]} arr
 * @return {number}
 */

function sum(arr) {
  let sum=0;
  arr.forEach((x=>sum=sum+x))
  return sum;
  // You only need to implement this function.
}


if (sum([32, 33, 16, 40]) !== 121)
  console.log("Test fails: Expected 121 for input arr = [32, 33, 16, 40]");
else
  console.log("Sample test case for input arr = [32, 33, 16, 40] passed!");

module.exports = sum

