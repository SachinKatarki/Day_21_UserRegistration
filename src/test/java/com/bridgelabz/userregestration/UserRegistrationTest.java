package com.bridgelabz.userregestration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	 UserRegistartion userRegistration = new UserRegistartion();

	    @Test
	    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Sachin");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
	        boolean result = userRegistration.firstName("Sachin");
	        Assert.assertEquals(false, result);
	    }

}
