// This program is showing the communication between two goroutine via channel
package main
import(
	"fmt"
	"time"
)

// A goroutine, continously pushing "ping" to channel.
//pinger will wait untill printer is ready to receive the message.
func pinger(c chan string){
	for{
		c <- "ping"
	}
}

func ponger(c chan string){
	for{
		c <- "pong"
	}
}

// A goroutine, receive message from pinger and print
func printer(c chan string){
	for{
		msg:= <- c
		fmt.Println(msg)
		time.Sleep(1 * time.Second)
	}
}

// ***********
// change main function to main from main1 to execute the program.
func main1(){
	c := make(chan string)
	go pinger(c)
	go printer(c)
	go ponger(c)
	//This is just to hold the thread.
	//To stop program, click any key
	var input string
	fmt.Scanln(&input)
}