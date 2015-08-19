package oss;

import java.util.ArrayList;
import java.util.List;

public class PersonClub {

	public List<Person> getAllPersons() {
		List<Person> listPersons = new ArrayList<Person>();

		listPersons.add(new Person("Sasha", 30));
		listPersons.add(new Person("Pavlo", 25));
		listPersons.add(new Person("Ivan", 99));
		return listPersons;

	}

}
