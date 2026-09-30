
public class Test {
	public static void main(String[] args) {
		
        Zoo zoo1 = new Zoo();

        System.out.println("----- Zoo 1 -----");
        zoo1.displayDetails();



        Zoo zoo2 = new Zoo(101, "Karasbag");
        System.out.println("\n----- Zoo 2 -----");
        zoo2.displayDetails();


        Zookeeper zookeeper = new Zookeeper("Amit");
        Animal animal = new Animal("Tiger");

        Zoo zoo3 = new Zoo(102, "Wildlife Zoo", zookeeper, animal);
        System.out.println("\n----- Zoo 3 -----");
        zoo3.displayDetails();
	}

}
