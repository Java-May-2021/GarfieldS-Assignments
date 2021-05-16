public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

    //methods
	public void throwSomething() {
		System.out.println("throwing stuff here");
		energyLevel = energyLevel- 5;
	}
	public void eatBanana() {
		System.out.println("eating bananas");
		energyLevel =energyLevel+ 10;
	}
	public void climb() {
		System.out.println("climbing stuff here");
		energyLevel = energyLevel-10;
	}
}