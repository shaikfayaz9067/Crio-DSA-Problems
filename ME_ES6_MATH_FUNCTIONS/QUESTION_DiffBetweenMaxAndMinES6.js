/**
 * @param {number[]} arr
 * @return {number}
 */
function maxMinDifference(arr) {
  // You only need to implement this function.
  return Math.max(...arr)-Math.min(...arr)
}

if (maxMinDifference([9, 1, 3, 4]) !== 8)
  console.log("Test fails: Expected 8 for input arr = [9, 1, 3, 4]");
else console.log("Sample test case for input arr = [9, 1, 3, 4] passed!");

module.exports = maxMinDifference;

