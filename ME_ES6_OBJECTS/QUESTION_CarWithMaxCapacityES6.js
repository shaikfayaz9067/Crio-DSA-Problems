/**
 * @param {object[]} arr
 * @return {string}
 */
function maxCapacityType(arr) {
    let first=arr[0].capacity;
    let name=arr[0].type;
    // You only need to implement this function.
    for(let i=1;i<arr.length;i++){
        if(arr[i].capacity>first){
            first=arr[i].capacity;
            name=arr[i].type;
        }
        }
        return name;

}


if (maxCapacityType([{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}]) !== 'Station Wagon')
    console.log("Test fails: Expected 'Station Wagon' for input arr = [{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}]");
else
    console.log("Sample test case for input arr = [{color: 'Red', type: 'Station Wagon', capacity: 5}, {color: 'Black', type: 'Sedan', capacity: 4}] passed!");


module.exports = maxCapacityType;

