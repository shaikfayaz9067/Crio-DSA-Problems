/**
 * @param {number[]} arr
 * @return {number | undefined}
 */


function firstEven(arr) {
  // arr.forEach((x,y)=>{
  //   if(x%2===0){
  //     return arr[y];
  //   }
  // })

  // You only need to implement this function.
  for(let i=0;i<arr.length;i++){
    if(arr[i]%2===0){
      return arr[i];
    }
  }
}

if (firstEven([1, 2, 3, 2, 3, 2]) != 2)
  console.log("Test fails: Expected 2 for input arr = [1, 2, 3, 2, 3, 2] ");
else
  console.log("Sample test case for input arr = [1, 2, 3, 2, 3, 2] passed!");


module.exports = firstEven

