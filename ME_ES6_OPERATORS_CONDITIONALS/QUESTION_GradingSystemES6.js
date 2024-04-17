/**
 * @param {number} marks
 * @return {string}
 */

function gradeMarks(marks) {
    if(marks >=0 && marks < 25){
      return "F";
    }
    else if(marks >=25 && marks < 45){
      return "E";
    }
    else if(marks >=45 && marks < 50){
      return "D";
    }
    else if(marks >=50 && marks < 60){
      return "C";
    }
    else if(marks >=60 && marks < 80){
      return "B";
    }
    else if(marks >=80 && marks <= 100){
      return "A";
    }
    else{
      return "Invalid";
    }
}

if (gradeMarks(45) !== "D")
    console.log("Test fails: Expected D for input marks = 45");
else
    console.log("Sample test case for input marks = 45 passed!");

module.exports = gradeMarks;

