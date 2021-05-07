import java.util.ArrayList;

public class TheBasic13 {
    public int[] allnum() {
        int x = 255;
        int[] myArray;
        myArray = new int[x];
        for (int i = 0; i < x; i++) {
            myArray[i] = i;
        }
        return myArray;
    }// end all numbers

    public void PrintOdds() {
        for (int i = 0; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } // end if
        }
    }// end all num odd

    public void PrintSum() {
        int sum = 0;
        int i = 0;
        while (i <= 255) {
            sum = i + sum;
            System.out.println(String.format("New number: %d, Sum: %d", i, sum));
            i++;
        }

    }

    public int SumArray(int[] numbers) {
        int Total = 0;
        for (int i = 0; i < numbers.length; i++) {
            Total += numbers[i];
        }
        return Total;
    }// end Summ Arry

    public void AllArrayValues(int[] arr) {
        for (int val : arr) {
            System.out.println(val);
        }
    }// end AllArrayValues

    public int MaxArrayValue(int[] arr) {
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }// end MaxArrayValue

    public int MinArrayValue(int[] arr) {
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Min > arr[i]) {
                Min = arr[i];
            }
        }
        return Max;
    }// end MaxArrayValue

    public int AverageArrayValue(int[] arr) {
        int x = SumArray(arr);
        return x / arr.length;
    } // end average array value

    public ArrayList<Integer> OddArray() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 != 0) {
                myArray.add(i);
            } // end if
        }
        return myArray;
    }// end all num odd Array

    public int GreaterThanY(int[] arr, int y) {
        int count = 0;
        for (int num : arr) {
            if (num > y)
                count++;
        }
        return count;
    }// end greater than Y

    public int[] SquareArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }
    // end of Square the values

    public int[] EliminateNegatives(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                nums[i] = 0;
        }
        return nums;
    } // end Elim Negative

    public voidd MaxMinAverage(int[] nums) {
        int min = MinArrayValue(nums);
        int max = MaxArrayValue(nums);
        double avg = AverageArrayValue(nums);
        System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
    }// end max min ave

    public void ShiftArrayValues(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0;
    }// Shifting the Values in the Array

}
