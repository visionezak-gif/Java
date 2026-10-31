
const prompt = require("prompt-sync")();

	
	function collectScores(studentScores, student, subject){
	
	 student = Number(prompt("Enter students number "))
	
	 subject = Number(prompt("Enter number of student subject: "))
	
	  studentScores = []
	  for(let index = 0; index < student; index++){
	  studentScores[index] = []
	
	  console.log("Student" + (index + 1))
	  
	for(let count = 0; count < subject; count++){
	let scores = Number(prompt("Enter subject" + (count + 1) + " score: "));
	
	
	  studentScores[index][count] = scores;

	
	}
	
	
	
	}
	return studentScores
	
}
let result = collectScores();

console.log(result)


for (let index = 0; index < result.length; index++){
   
   let result2 = collectTotal(result, index)
   
   console.log("Student" + (index + 1)+ " total: " +result2)
   
   }
   





   
   function collectTotal(studentScores, studentIndex){
   
   let total = 0;
   
   for (let index = 0; index < studentScores[studentIndex].length; index++){
   
      total += studentScores[studentIndex][index];
   }
   
  	 return total;

   }




