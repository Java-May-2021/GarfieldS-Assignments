import java.util.HashMap;
import java.util.Set;

public class hashmatique {
    public static void main(String[] args) {
        
        HashMap<String,String> Tracklist = new HashMap<String, String>();
        Tracklist.put("BOOMBAYA"," 춤추는 불빛은 날 감싸고 도네 Black to the pink 어디서든 특별해 Oh yes 쳐다 보든 말든 I wanna dance Like 따라다라단딴 따라다라단딴 뚜두룹바우 ");       
        Tracklist.put("The Land of Unicorns", "I have arrived, in a world ruled by chaos and evil Darkness enfolds the land that I once called my home Lost in the realm of an ancient and powerful wizard Now I must quest to take back the Crystalline Throne " );
        Tracklist.put("i n t e r l u d e"," I'm a livin little good thing it's like you never lived for me yeah mama said you was a good thing, uh Good, good, good yeah yeah" );
        Tracklist.put("The Blacker the Berry", "I'm the biggest hypocrite of 2015 Once I finish this, witnesses will convey just what I mean I mean, it's evident that I'm irrelevant to society That's what you're telling me, penitentiary would only hire me " );
            Set<String> keys = Tracklist.keySet();
            System.out.println(" Still Love this line by kendrick " + Tracklist.get("The Blacker the Berry"));
            for(String key : keys) { 
                System.out.println(key + ": "+Tracklist.get(key));
                System.out.println();
                System.out.println();
            }

           
    }//end main        

}//end all
