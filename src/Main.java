public class Main {
    public static void main(String[] args) {
        // Strings are immutable and a small program can create numerous String objects
        // This code creates 27 string objects because in each iteration a String object becomes eligable for garbage collection.
        String alpha=""; // empty string instantiated
        for (char current= 'a'; current<='z';current++){
            alpha+=current; // appends an "a"
            System.out.println(alpha);
        }

    }
}
