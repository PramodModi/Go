// Change main1() to main() function at line 20.
package main
import(
	"io"
	"net/http"
)

func hello(res http.ResponseWriter, req *http.Request ){
	res.Header().Set(
		"Content-Type",
		"text/html",
	)
	// Return html String to requester
	htmlString := " <doctype html> <html> <head> <title>Hello Dear</title></head><body>Hello Dear</body></html> "

	io.WriteString(res, htmlString)
}

// Change main1() to main()
func main1(){
	http.HandleFunc("/hello", hello)
	http.ListenAndServe("localhost:9000", nil)
}