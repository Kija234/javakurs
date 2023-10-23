package unterkapitel_03_05;

public class Programmer  extends Person{
	
	private String programmingLanguage;
	
	public void setLanguage(String l) {
		programmingLanguage = l;
	}
	public String getLanguage() {
		return programmingLanguage;
	}
	
	public void introduceYourSelf() {
		System.out.println("Hallo! Mein Name ist " + getName() + ".");
		System.out.print("Ich bin Programmierer für ");
		System.out.println("die Sprache " + getLanguage() + "!");
	}

}
