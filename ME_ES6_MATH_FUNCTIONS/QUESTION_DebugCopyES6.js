/**
 * @param {object} data
 * @param {string} str
 * @return {boolean}
 */


function copy(data, str) {
  const data_copy = {...data};
  data_copy.name = str;
  if (data === data_copy)
    return true;
  else
    return false;
}
if (copy({name: "Kevin", age: 40 }, "Allen") !== false)
  console.log("Test fails: Expected false for input data = {name: 'Kevin', age: 40 } and str = 'Allen'");
else
  console.log("Sample test case for input data = {name: 'Kevin', age: 40 } and str = 'Allen' passed!");

module.exports = copy;

