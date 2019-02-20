package com.beingjavaguys.core;

public class JsonImplementation {
	public static void main(String args[]) {

		// java to json conversion
		JavaToJson javaToJson = new JavaToJson();
		javaToJson.convertJavaToJson();

		// json to java conversion
		JsonToJava jsonToJava = new JsonToJava();
		jsonToJava.jsonToJava();

	}
}