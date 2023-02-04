package main

import (
	"fmt"
	"sort"
)

// Make a struct of person
type Person struct{
	Name string
	Age int
}

// Make a slice of Person for sorting by name
type ByName []Person

// sort() function takes  sort.interface.
// Three methods needs to be implemented as part of interface
//Len(), Less(), Swap()

func (this ByName) Len()int{
	return len(this)
}
func (this ByName) Less(i, j int) bool{
	return this[i].Name < this[j].Name
}
func (this ByName) Swap(i, j int){
	this[i], this[j] = this[j], this[i]
}

//Sort by Age
type ByAge []Person

func (this ByAge) Len() int{
	return len(this)
}
func (this ByAge) Less(i, j int) bool{
	return this[i].Age < this[j].Age
}
func (this ByAge) Swap(i, j int){
	this[i], this[j] = this[j], this[i]
}

func main(){
	kids := []Person{
		{"Jill", 9},
		{"Jack", 10},
		{"Jain", 8},
	}
	sort.Sort(ByName(kids))
	fmt.Println("Sort by name")
	fmt.Println(kids)

	sort.Sort(ByAge(kids))
	fmt.Println("sort by Age")
	fmt.Println(kids)
}
