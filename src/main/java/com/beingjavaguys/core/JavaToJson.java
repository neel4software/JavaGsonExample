package com.beingjavaguys.core;

import java.util.ArrayList;
import com.beingjavaguys.domain.Student;
import com.google.gson.Gson;

public class JavaToJson {
	public void convertJavaToJson() {

		// simple object from student domain class
		Student student = new Student();

		// added some data to student's object
		ArrayList<String> interests = new ArrayList<String>();
		interests.add("friends");
		interests.add("women");
		interests.add("chatting");

		student.setId(1);
		student.setFirstName("ankush");
		student.setLastName("thakur");
		student.setGender("male");
		student.setInterests(interests);

		// obtained Gson object
		Gson gson = new Gson();

		// called toJson() method and passed student object as parameter
		// print generated json to console
		System.out.println(gson.toJson(student));

	}
}