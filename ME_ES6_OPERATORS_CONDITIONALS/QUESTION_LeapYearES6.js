/**
 * @param {number} year
 * @return {string}
 */

function checkLeapYear(year) {
  if(year %400===0){
    return "LEAP YEAR";
  }
 if(year %4===0 && year%100!=0){
   return "LEAP YEAR";
 }
 return "COMMON YEAR";
}

if (checkLeapYear(2020) !== "LEAP YEAR")
  console.log("Test fails: Expected LEAP YEAR for input year = 2020");
else
  console.log("Sample test case for input year = 2020 passed!");

module.exports = checkLeapYear;

