package main

import (
	"fmt"
	m "unitTest/math"
)

func main(){
	fmt.Println("Calculating Average")
	xs := []float64{1,2,3,4}
	avg := m.Average(xs)
	fmt.Println("Average = ", avg)
}