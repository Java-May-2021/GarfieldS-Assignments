public class StringManipulator {
    public String TrimAndConcat(String Phrase1, String Phrase2) {
        String newPhrase = (Phrase1.trim() + Phrase2.trim());
        return newPhrase;
    }// end TrimAndConcat

    public Integer getIndexOrNull(String Phrase1, char char1) {
        int x = Phrase1.indexOf(char1);
        if (x == -1) {
            return null;
        } else {
            return x;
        }
    }// End GetIndexOrNull String Char

    public Integer getIndexOrNull(String Phrase1, String Phrase2) {
        int x =Phrase1.indexOf(Phrase2);
        if (x == -1) {
            return null;
        } else {
            return x;
        }

    }// End GetIndexOrNull String String

    public String concatSubstring(String Phrase1, int num1, int num2, String Phrase2){
        String x= Phrase1.substring(num1,num2);
        String Result=x+Phrase2;
        return Result;

    }//end concatSubstring
}
