/*
Defer statement schedules a function call to be run after the function complete.package defer
Defer is often used when resources need to be freed.
*/

package main

import (
	"fmt"
	"os"
	"bufio"
)

func main(){

	fmt.Println("---- Example 1 --------")
	example1()

	fmt.Println("---- File operation --------")
	example2()
}

// Here, second function will run after example 1 is finished
func example1(){
	defer second()
	first()
}
func first(){
	fmt.Println("1st")
}
func second(){
	fmt.Println("2nd")
}

//File operation. Use of defer to close the file

func example2(){
	f1, er := os.Create("test.txt")
	if er != nil{
		fmt.Println("Error while creating a file ", er)
	}
	defer f1.Close()

	//Write in file
	_, er = f1.WriteString("This is file operation")
	if er != nil{
		fmt.Println("Error while writing into file", er)
	}

	//Open file to read
	f2, er := os.Open("test.txt")
	if er != nil{
		fmt.Println("Error while opening file", er)
	}
	defer f2.Close()
	scanner := bufio.NewScanner(f2)
	scanner.Split(bufio.ScanLines)
	for scanner.Scan(){
		fmt.Println(scanner.Text())
	}

}
