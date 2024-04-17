/**
 * @param {number} len
 * @param {number} bre
 * @return {number | string} 
 */
 const calculateArea = (len, bre) => {
     if(len===0 || bre===0){
         return 'Not Possible'
     }
    // You only need to implement this function.
    return Math.abs(len*bre)
};


if (calculateArea(2, 3) !== 6)
    console.log("Test fails: Expected 6 for input len = 2 and bre = 3");
else
    console.log("Sample test case for input len = 2 and bre = 3 passed!");


module.exports = calculateArea;

