// Change main1 function to main to run it
package main

import(
	"fmt"
	"net"
	"encoding/gob"
)

// Create a server listen on TCP at port 9999

func server(){
	//listen on port
	ln, err := net.Listen("tcp", ":8888")
	if err != nil{
		fmt.Println("Error while creating Listen ", err)
		return
	}
	for{
		//Accept a connection
		c, err := ln.Accept()
		if err != nil{
			fmt.Println("Error while accepting connection ", err)
			continue
		}
		go handleServerConnection(c)
	}
}

func handleServerConnection(c net.Conn){
	defer c.Close()
	//receive the message
	var msg string
	err := gob.NewDecoder(c).Decode(&msg)
	if err != nil{
		fmt.Println("error while decoding msg ", err)
	} else {
		fmt.Println("Received ", msg)
	}

}

// Create a client, who will send message

func client(){
	c, err := net.Dial("tcp", "localhost:8888")
	if err != nil{
		fmt.Println("error while Dialing ", err)
		return
	}

	defer c.Close()
	// Sending the message
	
	msg := "Hello Dear"
	fmt.Println("Sending message ", msg)
	err = gob.NewEncoder(c).Encode(msg)
	if err != nil{
		fmt.Println("error whil encoding message ", err)
	}
	
}

// Change main1 function to main to run it
func main1(){
	go server()
	go client()

	var input string
	fmt.Scanln(&input)
}