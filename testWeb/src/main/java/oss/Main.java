package oss;

public class Main {

	public static void main(String[] args) {
		PersonClub pp= new PersonClub();
		
		for (Person per : pp.getAllPersons()) {
			System.out.println(per);
		}

	}

}
