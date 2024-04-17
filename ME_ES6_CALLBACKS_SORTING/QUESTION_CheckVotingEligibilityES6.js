/**
 * @param {number[]} ages
 * @return {number[]}
 */

function canVote(ages) {
  let res=[]
  ages.forEach((x)=>{
    if(x>=18){
       res.push(x)
    }
   })
    // console.log(res)
    return res;
  // You only need to implement this function.
}


if (JSON.stringify(canVote([32, 33, 16, 40])) !== JSON.stringify([32, 33, 40]))
  console.log("Test fails: Expected [32, 33, 40] for input ages = [32, 33, 16, 40]");
else
  console.log("Sample test case for input arr = [32, 33, 16, 40] passed!");

module.exports = canVote

