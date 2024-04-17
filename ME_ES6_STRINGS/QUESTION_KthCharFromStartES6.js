/**
 * @param {string} str
 * @param {number} k
 * @return {string}
 */


function kthCharFromStart(str, k){
  return str.charAt(k-1);
  // You only need to implement this function.
}

if (kthCharFromStart("abcdefghi", 2) !== 'b')
  console.log("Test fails: Expected 'b' for input str = 'abcdefghi' and k = 2");
else
  console.log("Sample test case for input str = 'abcdefghi' and k = 2 passed!");

module.exports = kthCharFromStart

