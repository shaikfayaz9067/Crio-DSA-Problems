/**
 * @param {number} val
 * @return {string}
 */



function orderLogic(val) {
  if(val >=10){
    return "Greater than or equal to 10"
  }
  else if(val >=5 && val < 10){
    return "Less than 10";
  }
  else{
    return "Less than 5"
  }
  // You only need to implement this function.
}

if (orderLogic(6) !== 'Less than 10')
  console.log("Test fails: Expected 'Less than 10' for input val = 6");
else
  console.log("Sample test case for input val = 6 passed!");

module.exports = orderLogic

