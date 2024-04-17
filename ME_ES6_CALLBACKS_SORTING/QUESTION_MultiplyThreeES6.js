/**
 * @param {number[]} arr
 * @return {number[]}
 */


function multiplyThree(arr) {
  let res=[]
  arr.forEach(x=>res.push(x*3))
  // console.log(res)
  return res
  // You only need to implement this function.
}

if (JSON.stringify(multiplyThree([1, 2, 3])) !== JSON.stringify([3, 6, 9]))
  console.log("Test fails: Expected [3, 6, 9] for input arr = [1, 2, 3]");
else
  console.log("Sample test case for input arr = [1, 2, 3] passed!");

module.exports = multiplyThree

