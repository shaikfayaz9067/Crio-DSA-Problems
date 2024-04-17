/**
 * @param {string} str
 * @param {number} k
 * @return {string}
 */


function repeatString(str, k){
  // You only need to implement this function.
   if (k <= 0) {
        return "";
    }

    let result = "";
    for (let i = 0; i < k; i++) {
        result += str;
    }

    return result;
}

if (repeatString("!", 3) !== "!!!")
  console.log("Test fails: Expected '!!!' for input str = '!' and k = 3");
else
  console.log("Sample test case for input str = '!' and k = 3 passed!");

module.exports = repeatString

