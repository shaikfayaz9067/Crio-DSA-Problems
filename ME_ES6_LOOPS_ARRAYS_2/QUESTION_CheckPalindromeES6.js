/**
 * @param {string} str
 * @return {boolean}
 */


function checkPalindrome(str){
  for(let i=0;i<str.length/2;i++){
    if(str.charAt(i)!=str.charAt(str.length-i-1)){
      return false
    }
  }
  return true;
  // You only need to implement this function.
}

if (checkPalindrome("madam") !== true)
  console.log("Test fails: Expected true for input str = 'madam'");
else
  console.log("Sample test case for input str = 'madam' passed!");

module.exports = checkPalindrome

