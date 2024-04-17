/**
 * @param {number} size
 * @return {number[][]}
 */


function createMatrixII(size){
  // You only need to implement this function.
  let k=-1;
  let arr=[]
  for(let i=0;i<size;i++){
    let row =[]
    for(let j=0;j<size;j++){
     row.push(++k);
    }
    arr.push(row)
  }
  return arr;
}

if (JSON.stringify(createMatrixII(2)) !== JSON.stringify([ [ 0, 1 ], [ 2, 3 ] ]))
  console.log("Test fails: Expected [ [ 0, 1 ], [ 2, 3 ] ] for input size = 2");
else
  console.log("Sample test case for input size = 2 passed!");

module.exports = createMatrixII

