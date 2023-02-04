/*
When Panic() function is raised, the code prints a panic message and the function crashes.package panic
Pacic() function can be raised by program itself when an unexpected error occurs or 
can programmer throws the exception on purpose for handling particular error.
If there are other goroutine is on going, they function normally and return.
Once all goroutine have returned, the program crashes.
However, defer function will always get call, even the program crashes.
*/

package main
import "fmt"

func main(){
	empName := "Pramod"
	age := 40
	employee(empName, age)

	empName = "Ram"
	age = 67
	employee(empName, age)
}

func employee(empName string, age int){
	if age > 60{
		panic("Age is more than acceptable limit")
	}
	fmt.Printf("Employee %v is ok for registration\n", empName)
}