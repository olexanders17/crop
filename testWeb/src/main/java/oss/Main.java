package oss;

import java.util.List;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		PersonClub pp= new PersonClub();
//		
//		for (Person per : pp.getAllPersons()) {
//			System.out.println(per);
//		}

	
	
	Gson gson= new Gson();
	String jsonPeson=gson.toJson(pp.getAllPersons());
//	List<Person> personListfromJson=gson.fromJson(jsonPeson,List<Person>.class );
	
	
	}
	
	

}
