/**
 * @param {string[]} arr
 * @return {string[]}
 */


function removeFalsyValues(arr) {
  // You only need to implement this function.
  // let i=0;
  let res=[]
  for(let j=0;j<arr.length;j++){
    if(arr[j]){
      res.push(arr[j]);
    }
  }
  return res;
}

if (removeFalsyValues([1,2,3]).toString()!== [ 1, 2, 3 ].toString())
  console.log("Test fails: Expected [1, 2, 3] for input arr = [1, 2, 3]");
else
  console.log("Sample test case for input arr = [1, 2, 3] passed!");

module.exports = removeFalsyValues

