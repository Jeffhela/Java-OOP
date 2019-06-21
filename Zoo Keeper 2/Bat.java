public class Bat extends Mammal {
    public Bat() {
        energyLevel = 300;
    }
    public void fly1() {
        System.out.println("Whoosh, Whoosh!");
        energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("Cluck, Cluck!");
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("Boom, Squeak, AAAHHHHHHHHH!");
        energyLevel -= 100;
    }
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
