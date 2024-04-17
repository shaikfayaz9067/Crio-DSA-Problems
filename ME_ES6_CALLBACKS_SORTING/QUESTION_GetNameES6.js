/**
 * @param {object[]} arr
 * @return {string[]}
 */

function getFullName(obj) {
  // You only need to implement this function.
function fullName(obj) {
        return obj.firstname + " " + obj.lastname;
    }

    // Use the map method with the helper function
    var resultArray = obj.map(fullName);

    // Return the array with full names
    return resultArray;
}


if (getFullName([
  { firstname: "Robert", lastname: "Obrain" },
  { firstname: "Kevin", lastname: "Hart" },
  { firstname: "Dane", lastname: "Cobby" }
]).toString() != ["Robert Obrain", "Kevin Hart", "Dane Cobby"])
  console.log("Test fails: Expected output: ['Robert Obrain', 'Kevin Hart', 'Dane Cobby'] ");
else
  console.log("Sample test case passed!");


module.exports = getFullName

