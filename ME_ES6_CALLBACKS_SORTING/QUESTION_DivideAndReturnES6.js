/**
 * @param {number[]} arr
 * @return {number[]}
 */


function halfValues(arr) {
  // You only need to implement this function.
  let res=[]
  res.push(arr[0]);
 for(let i=1;i<arr.length;i++){
   res.push(arr[i]/(i+1));
 }
//  console.log(res)
 return res;
}

if (halfValues([2, 3, 4]).toString() != [2, 1.5, 1.3333333333333333].toString())
  console.log("Test fails: Expected [ 2, 1.5, 1.3333333333333333 ] for input arr = [2, 3, 4] ");
else
  console.log("Sample test case for input arr = [2, 3, 4] passed!");


module.exports = halfValues

