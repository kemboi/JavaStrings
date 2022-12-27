public class Main {
    public static void main(String[] args) {
        // Strings are immutable and a small program can create numerous String objects
        // This code creates 27 string objects because in each iteration a String object becomes eligable for garbage collection.
        String alpha=""; // empty string instantiated
        for (char current= 'a'; current<='z';current++)
            alpha+=current; // appends an "a"
        System.out.println(alpha);

        // the above code can be improved by using StringBuilder
        // StringBuilder is not immutable. In each iteration, an interim String value is not created, but appended to the current String object
        System.out.println("Testing StringBuilder\n\n");
        StringBuilder alpha2= new StringBuilder();
        for (char current= 'a'; current<='z';current++)
            alpha2.append(current); // appends an "a"
        System.out.println(alpha);

    }
}
