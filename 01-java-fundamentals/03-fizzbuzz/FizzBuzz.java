public class FizzBuzz {
    public String fizzBuzz(int number) {
        if ((number % 3) == 0) {
            if ((number % 5) == 0) {
                return "Fizzbuzz";
            } else {
                return "Fizz";
            }
        } // end if divisable by 3
        if ((number % 5) == 0) {
            return "Buzz";
        } // end if divisable by 5
        else {
            return String.valueOf(number);
        }
    }
}
