/**
 * @param {number[]} arr
 * @return {boolean}
 */


function checkNonDecreasing(arr) {
  let small=arr[0]
  let res=true;
 for(let i=1;i<arr.length;i++){
   if(small>arr[i]){
     return false;
   }
 }
 return true;
  // You only need to implement this function.
}

if (checkNonDecreasing([6, 9, 10, 12]) !== true)
  console.log("Test fails: Expected true for input arr = [6, 9, 10, 12]");
else
  console.log("Sample test case for input arr = [6, 9, 10, 12] passed!");

module.exports = checkNonDecreasing

