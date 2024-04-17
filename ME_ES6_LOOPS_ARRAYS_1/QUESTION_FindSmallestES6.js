/**
 * @param {number[]} arr
 * @return {number}
 */


function findSmallest(arr) {
  // You only need to implement this function.
  let small=arr[0];
  for(let i=1;i<arr.length;i++){
    if(arr[i]<small){
      small=arr[i]
    }
  }
  return small;
}

if (findSmallest([5, 6, 3, 4]) !== 3)
  console.log("Test fails: Expected 3 for input arr = [5, 6, 3, 4]");
else
  console.log("Sample test case for input arr = [5, 6, 3, 4] passed!");

module.exports = findSmallest

