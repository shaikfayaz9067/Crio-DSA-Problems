/**
 * @param {string} day
 * @return {string}
 */


function greeting(day) {
  // You only need to implement this function.
  function getMessage() {
        return "Today is: " + day;
    }

    // Return the inner function
    return getMessage;
}

if (greeting('Sunday')() !== 'Today is: Sunday')
  console.log("Test fails: Expected 'Today is: Sunday' for input day = 'Sunday' ");
else
  console.log("Sample test case for input  day = 'Sunday' passed!");

module.exports = greeting

