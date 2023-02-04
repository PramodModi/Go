/*
A closure is a function that references variables outside its own function body (scope).
In other words, a closure is an inner function that has access to the variables in the scope
in which it was created.
A closure is a function value that references variables from outside its body. 
The function may access and assign to the referenced variables; 
in this sense the function is "bound" to the variables.

An inner function together with the non-local variable it references is known as closure.
*/

package main
import "fmt"

func main(){
	fmt.Println("----Example1------")
	example1()

	fmt.Println("----Example2------")
	example2()

	fmt.Println("----Example3------")
	example3()
}

// Add is a local variable of type func(int, int) int. 
//local function has access to local variables
func example1(){
	add := func(x,y int) int{
		return x+y
	}
	fmt.Println(add(1,2))
}

//increment function has access to local variable.
//Although that variable is outside of scope of inner function.

func example2(){

	x := uint(0)
	increment := func() uint{
		x ++
		return x
	}

	fmt.Println("Calling increment function starting with 1")
	fmt.Println(increment())
	fmt.Println(increment())
	fmt.Println(increment())

}

//One ore use of closure is to write a function which rturns another function. 
//which when called, generate a sequence of numbers.

func makeEvenGenerator() func() uint{
	i := uint(0)
	return func() (ret uint){
		ret = i
		i += 2
		return
	}
}
//Print only even number starting from 0.
func example3(){
	nextEven := makeEvenGenerator()
	fmt.Println(nextEven())
	fmt.Println(nextEven())
	fmt.Println(nextEven())
}