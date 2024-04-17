/**
 * @param {string[]} names
 * @param {number} start
 * @param {number} end
 * @return {string[]}
 */

function getName(names, start, end) {
  // You only need to implement this function.
  var resultArray = names.slice(start, end);

    // Return the array with selected elements
    return resultArray;
}

if (
  JSON.stringify(getName(["Ravi", "Pulkit", "Kiran", "Aagam"], 2, 4)) !==
  JSON.stringify(["Kiran", "Aagam"])
)
  console.log(
    "Test fails: Expected ['Kiran', 'Aagam'] for input names = ['Ravi', 'Pulkit', 'Kiran', 'Aagam'], start = 2, end = 4"
  );
else
  console.log(
    "Sample test case for input names = ['Ravi', 'Pulkit', 'Kiran', 'Aagam'], start = 2, end = 4 passed!"
  );

module.exports = getName;

