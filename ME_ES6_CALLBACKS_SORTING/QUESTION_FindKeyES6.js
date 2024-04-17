/**
 * @param {number[]} arr
 * @param {number} key
 * @return {boolean}
 */


function search(arr, key) {
  for(let i=0;i<arr.length;i++){
    if(arr[i]===key){
      return true
    }
  }
  return false;
  // You only need to implement this function.
}

if (search([1, 2, 3, 2, 3, 2], 0) != false)
  console.log("Test fails: Expected false for input arr = [1, 2, 3, 2, 3, 2], and key = 0 ");
else
  console.log("Sample test case for input arr = [1, 2, 3, 2, 3, 2], and key = 0  passed!");


module.exports = search

