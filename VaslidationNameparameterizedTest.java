package com.pack1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VaslidationNameparameterizedTest {
private String name;
private boolean result;

public VaslidationNameparameterizedTest( String name, boolean result) {
	this.name=name;
	this.result=result;
}
// creates the test data
@Parameters
public static Collection<Object[]> data() {
    Object[][] data = new Object[][] { { "Dibakar" , true }, { "dibakar",false }, {"Diba kar", true }, {"Diba", false }};
    return Arrays.asList(data);
}

@Test
public void validNameTestNegative() {
	ValidationName obj = new ValidationName();
	boolean output = obj.validName(name);
	assertEquals(this.result,output);
}
}
