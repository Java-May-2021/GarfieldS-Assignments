public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.TrimAndConcat("    Hello     ", "     World    ");
        System.out.println(str); // HelloWorld
        System.out.println();// spacer
        // end First Task

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        System.out.println();// spacer
        // end second task

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null
        System.out.println();// spacer
        // end Third Task

        String newword = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(newword); // eworld
        //Final Task
        
    }
}
