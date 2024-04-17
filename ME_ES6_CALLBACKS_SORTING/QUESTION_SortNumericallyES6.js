/**
 * @param {number[]} arr
 */

function sortNumerically(arr) {
  arr.sort((x,y)=>{
    return x-y;
  })
  // You only need to implement this function.
}

var arr = [20, 10, 50, 60];
if (sortNumerically(arr) && arr != [10, 20, 50, 60])
  console.log("Test fails: Expected [10, 20, 50, 60] for input arr = [20, 10, 50, 60] ");
else
  console.log("Sample test case for input arr = [20, 10, 50, 60] passed!");

module.exports = sortNumerically

