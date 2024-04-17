/**
 * @param {string} str
 * @return {string}
 */


function reverseString(str){
  // You only need to implement this function.
 return str.split('').reverse().join('')
  
}

if (reverseString("abcdefghi") !== "ihgfedcba")
  console.log("Test fails: Expected 'ihgfedcba' for input str = 'abcdefghi'");
else
  console.log("Sample test case for input str = 'abcdefghi' passed!");

module.exports = reverseString

