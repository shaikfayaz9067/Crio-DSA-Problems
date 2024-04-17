/**
 * @param {object}obj
 * @param {string}propName
 * @return {boolean}
 */


function checkProperty(obj,propName){
  if(obj[propName]){
    return true
  }
  return false
  // You only need to implement this function.
}

if ((checkProperty({ firstName: 'Alex' }, "firstName")) !== true)
  console.log("Test fails: Expected true for input obj = { firstName: 'Alex' }, and propName = 'firstName'");
else
  console.log("Sample test case for input obj = { firstName: 'Alex' }, and propName = 'firstName' passed!");


module.exports = checkProperty

