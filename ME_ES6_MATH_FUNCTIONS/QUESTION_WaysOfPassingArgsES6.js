/**
 * @param {number[]} arr
 */
function manipulatingArray(arr) {
 for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
      // If the number is even, add 5
      arr[i] += 5;
    } else {
      // If the number is odd, multiply by 5
      arr[i] *= 5;
    }
  }
  // You only need to implement this function.
}

var arr = [9, 1, 7, 4];
manipulatingArray(arr);
if (arr.toString() != [45, 5, 35, 9].toString()) {
  console.log(
    "Test fails: Expected [45, 5, 35, 9] for input arr = [9, 1, 7, 4]"
  );
} else {
  console.log("Sample test case for input arr = [9, 1, 7, 4] passed!");
}

module.exports = manipulatingArray;

