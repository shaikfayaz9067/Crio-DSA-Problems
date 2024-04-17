/**
 * @param {string} str
 * @param {number} startInd
 * @param {number} endInd
 * @return {string}
 */


function getSubstr(str, startInd, endInd){
   let res=""
  if(endInd>str.length){
    for(let i=startInd;i<str.length;i++){
    res=res+str.charAt(i);
  }
   return res;
  }
  else{
     for(let i=startInd;i<endInd;i++){
    res=res+str.charAt(i);
  }
  return res;
  }


}

if (getSubstr('abcdefghi', 2, 5) !== 'cde')
  console.log("Test fails: Expected 'cde' for input str = 'abcdefghi', startInd = 2 and endInd = 5");
else
  console.log("Sample test case for input str = 'abcdefghi', startInd = 2 and endInd = 5 passed!");

module.exports = getSubstr

