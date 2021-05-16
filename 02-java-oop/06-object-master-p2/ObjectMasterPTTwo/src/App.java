public class App {
    public static void main(String[] args) throws Exception {

        Samurai Jack = new Samurai();
        Ninja Aku = new Ninja();
        Wizard Ashi = new Wizard();


        Aku.steal(Jack);
        Ashi.heal(Jack);
        Aku.RunAway();
        Ashi.fireball(Aku);
        Jack.DeathBlow(Aku);
        System.out.println(Aku.getHealth());
        Jack.meditate();
        System.out.println(Jack.getHealth());

        
    }//end main

    
}