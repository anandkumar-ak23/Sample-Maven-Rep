package com.test1;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.package1.App;

public class AppTest {
	
	@Test
	public void testlogin1() {
		App myapp= new App();
		Assert.assertEquals(0,myapp.userVerification("anandkumar", "ak@1a0523") );
	}
	
	@Test
	public void testlogin2() {
		App myapp= new App();
		Assert.assertEquals(0,myapp.userVerification("anandumar", "ak1a0523") );
	}
}
