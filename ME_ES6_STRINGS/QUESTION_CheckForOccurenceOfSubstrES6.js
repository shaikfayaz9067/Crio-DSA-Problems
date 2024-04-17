/**
 * @param {string} str
 * @param {string} k
 * @return {boolean}
 */


function checkForSubstr(str, k){
  if(str.indexOf(k)!=str.lastIndexOf(k)){
    return false
  }
  return true;
  // You only need to implement this function.
}

if (checkForSubstr("abcdefghi", "def") !== true)
  console.log("Test fails: Expected true for input str = 'abcdefghi' and k = 'def'");
else
  console.log("Sample test case for input str = 'abcdefghi' and k = 'def' passed!");

module.exports = checkForSubstr

