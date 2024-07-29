package com.pack1;

public class ValidationName {

	public boolean validName(String name) {
		return name.matches("[A-Z]{1}[a-z ]{4,14}");
	}
}

// test inputs  - expected
// Dibakar    true 
//dibakar	false
//Diba		false
//Diba343asa	false
//Dib akar	true