package main
import(
	"fmt"
	"net/http"
	"sync"
)

var mu sync.Mutex
var count int

func main(){
	http.HandleFunc("/", handler)
	http.HandleFunc("/counter", counter)
	http.ListenAndServe("localhost:7777", nil)
}

func handler(w http.ResponseWriter, req *http.Request){
	mu.Lock()
	count ++
	mu.Unlock()
	fmt.Fprintf(w, "Welcome URL.Path = %q\n", req.URL.Path)
}

func counter(w http.ResponseWriter, req *http.Request){
	mu.Lock()
	fmt.Fprintf(w, "Total number of visit =  %d\n", count)
	mu.Unlock()
}