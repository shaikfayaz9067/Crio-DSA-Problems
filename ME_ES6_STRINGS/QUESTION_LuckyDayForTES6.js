/**
 * @param {string} name
 * @return {string}
 */


function checkEligibility(name){
  if(name.toUpperCase().charAt(0)==="T"){
    return "Eligible"
  }
  return "Not Eligible"
  // You only need to implement this function.
}

if (checkEligibility('tarun') !== 'Eligible')
  console.log("Test fails: Expected 'Eligible' for input name = 'tarun'");
else
  console.log("Sample test case for input name = 'tarun' passed!");

module.exports = checkEligibility

