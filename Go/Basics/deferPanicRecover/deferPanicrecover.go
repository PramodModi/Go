/*
Recover is a in-built function that gains control of panicking goroutine.
Recover is only useful inside of deffered function.
If the current goroutine is panicking, a call to recover will 
capture the value given to panic and resume normal execution.
*/
package main

import "fmt"

func main(){
	function1()
	fmt.Println("returned normally from function1")
}

func function1(){
	defer func(){
		if r:= recover(); r != nil{
			fmt.Println("Recovered in function1 ", r)
		}
	}()

	fmt.Println("Calling function raisePanic")
	raisePanic(0)
	fmt.Println("Return normally from raisePanic function")
}

func raisePanic(i int){
	if i > 3{
		fmt.Println("Panicking")
		panic(fmt.Sprintf("%v \n", i))
	}

	defer fmt.Println("defer in raisePanic function ", i)
	fmt.Println("Printing in raisePanic function ", i)
	raisePanic(i+1)
}


