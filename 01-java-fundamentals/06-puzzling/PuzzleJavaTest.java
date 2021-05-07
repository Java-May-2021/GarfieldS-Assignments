public class PuzzleJavaTest{
    public static void main(String[] args) {
        PuzzleJava id = new PuzzleJava();
        
        System.out.println("Puzzle One");
        int [] myArray =id.PuzzleOne();
        for(int i =0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }//puzzle one

        System.out.println("Puzzle Two");
        String[] LongerThan5=id.PuzzleTwo();
        for(int i =0; i< LongerThan5.length; i++){
            System.out.println(LongerThan5[i]);
        }//puzzle two

        System.out.println("Puzzle Three");
        id.PuzzleThree();
        //puzzle three
        
        System.out.println("Puzzle Four");
        id.PuzzleFour();
        //Puzzle four

        System.out.println("Puzzle Five");
        id.PuzzleFive();

        System.out.println("Puzzle Six");
        id.PuzzleSix();

        System.out.println("Puzzle Seven");
        id.puzzleSeven();



    }//end main
}