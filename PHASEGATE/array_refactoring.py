def list_sorting(numbers):
	result = []
	for vision in range(len(numbers)):
		columns = []
		for deo in range(len(numbers[vision])):
			columns.append(numbers[vision][(len(numbers[vision])) - 1- deo])
		result.append(columns)
	return result


print (list_sorting([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
	


