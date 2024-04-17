/**
 * @param {object} obj
 * @return {number}
 */
function getAge(obj) {
  return obj.age
}

if (getAge({ name: "Criodo", age: 17 }) !== 17)
  console.log("Test fails: Expected 17 for input obj = { name: 'Criodo', age: 17 } ");
else
  console.log("Sample test case for input obj = { name: 'Criodo', age: 17 } passed!");


module.exports = getAge;

