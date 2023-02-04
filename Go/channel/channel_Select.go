/*
Select works like a "Switch" but for channels.package channel
Select picks the channel which is ready. 
If more than one channel is ready then pick randomly any one to receive the message.
If non of them are ready then Select blocks untill one channel become ready.
So, implement timout in select.
"Default" is called immediately if channels are not ready, and come out from select. which is not good
So, better to use timeout.
*/

package main
import(
	"fmt"
	"time"
)

func main(){
	c1 := make(chan string)
	c2 := make(chan string)

	go func(){
		for i := 0; i< 10; i++ {
			c1 <- "1"
			time.Sleep(2* time.Second)
		}
	}()
	go func(){
		for j := 0; j < 10; j++{
			c2<- "2"
			time.Sleep(3* time.Second)
		}
	}()

	go func(){
		for{
			select{
			case msg1 := <- c1:
				fmt.Println(msg1)
			case msg2 := <- c2:
				fmt.Println(msg2)
			// time.after creates a channel and after the given time it will sned the current time.
			case <- time.After( 4 * time.Second):
				fmt.Println("Time out")
			}
		}
		
	}()

	var input string
	fmt.Scanln(&input) //Press any key to terminate program
}