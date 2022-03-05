package com.met.util;

import javax.rmi.CORBA.Util;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

	MathUtil Util = new MathUtil();
	
	
	@Test
	public void testAdd(){
		
		long result = Util.add(10, 20);
		
		Assert.assertEquals(30, result);
		
		
	}
	
}
