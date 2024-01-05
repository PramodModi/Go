/*
 Important operations of String.
 String is immutable and once value is set can not be modified. Any modification will create a new string.
 StringBuilder is mutable. That is good for updating the contents. It does not create new object.
 StringBuilder is more efficient for string manipulations that involve appending or modifying the content.
It provides methods like append and insert to modify the existing StringBuilder object in-place.
* */
public class Stringds {
    public static void main(String[] args) {
        //String creation and initialization
        String str1 = "Hello World"; // Using String literal
        String str2 = new String("Java"); //Using Construction

        String concatenated = str1 + " " + str2;
        System.out.println("concatenated : " + concatenated);

        //String length
        int len = concatenated.length();

        //Substring
        String str = "Java Programming";
        String substr = str.substring(4, 12);
        System.out.println("substr : " + substr);

        //String Comparison:
        String s1 = "Java";
        String s2 = "Java";

        boolean isEqual = s1.equals(s2); //true
        boolean isEqualIgnorecase = s1.equalsIgnoreCase("java");
        System.out.println("isEqual : " + isEqual);
        System.out.println("isEqualIgnorecase : " + isEqualIgnorecase);

        //Search In Strings
        str = "Java Programming";
        int indexOf = str.indexOf("Prog");
        int lastIndexOfa = str.lastIndexOf('a');
        System.out.println("String : " + str);
        System.out.println("indexOf Prog : " + indexOf);
        System.out.println("lastIndexOf a  : " + lastIndexOfa);

        // Trim and replace
        String original = "    Trim Me    ";
        String trimmed = original.trim();
        String replaced = original.replace("Me", "you");
        System.out.println("trimmed = "+ trimmed);
        System.out.println("replaced : " + replaced);

        // String split
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split("\\s+"); // Split by space
        for(String word: words) {
            System.out.println(word);
        }
        // Result: ["This", "is", "a", "sample", "sentence."]

        //String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        // "Name: John, Age: 25"

        //String Conversation
        int num = 42;
        String strNum = String.valueOf(num);


    // String Builder
        StringBuilder sb = new StringBuilder("Hello");
        for(int i = 0; i< 10; i++){
            sb.append(" ").append(i);
        }
        String result = sb.toString();
        System.out.println(result);



    }
}
