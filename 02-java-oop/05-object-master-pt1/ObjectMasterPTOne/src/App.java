public class App {
    public static void main(String[] args) throws Exception {

        Human Samurai = new Human(100);
        Human Ninja = new Human(100);


        Ninja.setStrength(50);
        Ninja.attack(Samurai);
        System.out.println(Samurai.getHealth());
    }//end main

    
}
