/**
 * @param {string} str
 * @return {number}
 */


function findLongestWordLength(str){
  let arr=str.split(' ');
  let long=arr[0].length
  for(let i=1;i<arr.length;i++){
    if(arr[i].length>long){
      long=arr[i].length;
    }
  }
  return long;
  // You only need to implement this function.
}

if (findLongestWordLength("I live in India") !== 5)
  console.log("Test fails: Expected 5 for input str = 'I live in India'");
else
  console.log("Sample test case for input str = 'I live in India' passed!");

module.exports = findLongestWordLength

