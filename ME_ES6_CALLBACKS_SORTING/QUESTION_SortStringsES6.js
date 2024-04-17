/**
 * @param {string[]} arr
 */


function sort(arr) {
  arr.sort()
  // You only need to implement this function.
}

var arr = ['abc', 'pqr', 'banana'];
if (sort(arr) && arr != ['abc', 'banana', 'pqr'])
  console.log("Test fails: Expected ['abc', 'banana', 'pqr'] for input arr = ['abc', 'pqr', 'banana'] ");
else
  console.log("Sample test case for input arr = ['abc', 'pqr', 'banana'] passed!");


module.exports = sort

