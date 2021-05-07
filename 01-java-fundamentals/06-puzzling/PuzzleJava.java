import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public int[] PuzzleOne() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        int[] myArray ={3,5,1,2,7,9,8,13,25,32};
        for(int i =0; i< myArray.length; i++){
            if(10<myArray[i]){
                myArrayList.add(myArray[i]);
            }
        }//end for loop

        int[] myFinalArray;
        myFinalArray = new int[myArrayList.size()];

        for (int i =0; i < myArrayList.size(); i++){
            myFinalArray[i]=myArrayList.get(i);
        }

        return myFinalArray;

    }// end First Puzzle

    public String[] PuzzleTwo(){
        ArrayList<String> myArrayList =new ArrayList<String>();
        ArrayList<String> Holder =new ArrayList<String>();
        String[] myArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        for(int i =0; i< myArray.length; i++){
            myArrayList.add(myArray[i]);
        }//end for loop
        
        Collections.shuffle(myArrayList);
        for (int i =0; i < myArrayList.size(); i++){
            System.out.print(myArrayList.get(i) + " ");
        }// returns random order
        
        System.out.println(" ");

        for (int i =0; i < myArrayList.size(); i++){ //makes an arraylist to hold values over 5 to be put in array
            if(myArrayList.get(i).length()>5){
                Holder.add(myArrayList.get(i));
            }
        }
        String[] LongerThan5;            
        LongerThan5 = new String [Holder.size()];
        for (int x =0; x < Holder.size(); x++){
            LongerThan5[x]=Holder.get(x);
        }
        return LongerThan5;
    }//end puzzle two
    
    public void PuzzleThree(){
        ArrayList<Character> myArrayList =new ArrayList<Character>();
        char [] alphabet="abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i =0; i< alphabet.length; i++){
            myArrayList.add(alphabet[i]);
        }//end for loop

        Collections.shuffle(myArrayList);
        System.out.println(myArrayList.get(0)+" "+myArrayList.get(25));
        if (myArrayList.get(0).equals('a')|| myArrayList.get(0).equals('e')|| myArrayList.get(0).equals('i')|| myArrayList.get(0).equals('o')|| myArrayList.get(0).equals('y') ){  //'a'||e'||'i'||'o'||'u'||'y'
            System.out.println("Winner is You");
        }
    } // end puzzle three

    public int[] PuzzleFour(){
    Random r = new Random();
    int[] list;
    list = new int [10];
    for(int i =0; i<10; i++){
        list[i]=r.nextInt(100-55)+55;
        //System.out.println( list[i]);
    }
    return list;
    }//end third puzzle

    public void PuzzleFive(){
    Random r = new Random();
    ArrayList<Integer> List = new ArrayList<Integer>();
    for(int i =0; i<10; i++){
        List.add(r.nextInt(100-55)+55);
    }

    Collections.sort(List);
    for(int i =0; i<10; i++){
        System.out.println(List.get(i));
    }
    System.out.println(List.get(0)+" is the smallest");
    System.out.println(List.get(9)+ " is the largest");
    }//end puzzle five

    public String PuzzleSix(){
        Random r = new Random();
        char [] alphabet="abcdefghijklmnopqrstuvwxyz".toCharArray();
        String ran=""; 
        for(int i=0; i<5; i++){
            ran=ran+String.valueOf(alphabet[r.nextInt(10)]);
        }
        System.out.println(ran);
        return ran;
    }// end Puzzle six

    
    public String[] puzzleSeven(){
        String [] Random10;
        Random10 = new String[10];
        for(int i =0; i<10; i++){
          Random10[i]=PuzzleSix();
        }
        return Random10;
      }// end Puzzle Seven 


}//actual end of thing