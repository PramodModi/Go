package math

import "testing"

//Prepare to run test with multiple data.
//create struct with input data and expected outputs

type Testpairs struct{
	inputData []float64
	expectedOutput float64
}

// Prepare test pairs
var testPairs = []Testpairs{
	{[]float64{1,2,3,4}, 2.5},
	{[]float64{1,1,1,1}, 1},
	{[]float64{-1,1}, 0},
	{[]float64{-1,-2,-3,-4}, -1.5}, //Purposfully kept wrong expected output
}

func TestAverage(t * testing.T){
	for _, pair := range testPairs{
		v := Average(pair.inputData)
		if v != pair.expectedOutput{
			t.Error("For ", pair.inputData, "Expected " , pair.expectedOutput, "but got ", v)

		}
	}
	
}