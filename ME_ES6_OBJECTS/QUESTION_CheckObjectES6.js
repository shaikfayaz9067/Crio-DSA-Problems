/**
 * @param {object}par1
 * @param {object}par2
 * @return {boolean}
 */


function checkObject(par1, par2) {
  if(Array.isArray(par1)|| Array.isArray(par2)){
    return true
  }
  return false
  // You only need to implement this function.
}

if ((checkObject(['code', 'javascript'], { language: 'javascript' })) !== true)
  console.log("Test fails: Expected true for input par1 = ['code','javascript'], and par2 = {language:'javascript'}");
else
  console.log("Sample test case for input par1 = ['code','javascript'], and par2 = {language:'javascript'} passed!");


module.exports = checkObject

