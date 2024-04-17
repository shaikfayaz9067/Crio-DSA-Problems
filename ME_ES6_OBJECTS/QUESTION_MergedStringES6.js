/**
 * @param {string[]}str
 * @return {string}
 */


function mergedString(str){
  let res=str[0];
  for(let i=1;i<3;i++){
    res=res+' '+str[i]
  }
  return res;
  // You only need to implement this function.
}

if ((mergedString(['code','for','good','intent'])) !== 'code for good')
  console.log("Test fails: Expected 'code for good' for input str = ['code','for','good', 'intent']");
else
  console.log("Sample test case for input str = ['code','for','good', 'intent'] passed!");


module.exports = mergedString

