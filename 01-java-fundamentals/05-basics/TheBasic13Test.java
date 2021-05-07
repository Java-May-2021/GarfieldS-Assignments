public class TheBasic13Test {
    public static void main(String[] args) {
        int[] nums = {23,234,2345,-23,42};
        TheBasic13 id = new TheBasic13();
        int i = 0;
        while (i < id.allnum().length ) {
            int x = id.allnum()[i];
            System.out.print(x + " ");
            i++;
        } // end First trial
        System.out.println();
       
        id.PrintOdds(); //prints odd numbers 1-255
        //end second trial


        id.PrintSum();
        //end third trial

        id.AllArrayValues(nums);

        System.out.println(id.MaxArrayValue(nums));
        System.out.println(id.AverageArrayValue(nums));

        for(i=0; i< id.OddArray().size(); i++){
            System.out.println( id.OddArray().get(i));

        }
       


    }// end main

}
