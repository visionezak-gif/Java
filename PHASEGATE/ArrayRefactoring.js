
function arraySorting(numbers){
	
	for(let vision = 0; vision < numbers.length; vision++){
		for(let deo =0; deo < numbers[vision].length; deo++){
			for (let seun = deo + 1; seun < numbers[vision].length; seun++){
			
				let spare = numbers[vision][deo];
				numbers[vision][deo] = numbers[vision][seun];
				numbers[vision][seun] = spare;
				
				
			
			}
		
		
		}
	
	  }
	return numbers;

  }

		
	let numbers = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
	

	
		let total = arraySorting(numbers);
		console.log(total);		
	
	


