/**
 * @return {string}
 */

function getNameAndLocation() {
  let ob = {name: "Crio", location: "Bengaluru"};
  const {name:a, location:b} = ob;
  return  a+" "+b;
}

console.log("You can play around with object destructuring. Check whether the variable names used are same or not and try debugging.");

module.exports = getNameAndLocation;

