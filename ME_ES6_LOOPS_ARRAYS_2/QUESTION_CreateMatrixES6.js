/**
 * @param {number} size
 * @return {number[][]}
 */


function createMatrix(size) {
  // You only need to implement this function.
  let arr=[]
  for(let i=0;i<size;i++){
    let row =[]
    for(let j=0;j<size;j++){
     row.push(j);
    }
    arr.push(row)
  }
  return arr;
}

if (JSON.stringify(createMatrix(2)) !== JSON.stringify([[0, 1], [0, 1]]))
  console.log("Test fails: Expected [ [ 0, 1 ], [ 0, 1 ] ] for input size = 2");
else
  console.log("Sample test case for input size = 2 passed!");

module.exports = createMatrix

