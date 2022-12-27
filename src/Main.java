public class Main {
    public static void main(String[] args) {
        // Strings are immutable and a small program can create numerous String objects
        String alpha=""; // empty string instantiated
        for (char current= 'a'; current<='z';current++){
            alpha+=current; // appends an "a"
            System.out.println(alpha);
        }

    }
}