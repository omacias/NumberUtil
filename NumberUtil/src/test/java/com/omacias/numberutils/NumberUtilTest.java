package com.omacias.numberutils;

import org.junit.Test;

import junit.framework.Assert;

public class NumberUtilTest {

	@Test(expected = NullPointerException.class)
	public void test(){
		double nbr = 2334.34;
		
		Assert.assertEquals(2334d,NumberUtil.roundDown(nbr));
		
		Assert.assertEquals(2335d, NumberUtil.roundUp(nbr));
		
		nbr = 2334d;
		
		Assert.assertEquals(2334d, NumberUtil.roundUp(nbr));
		Assert.assertEquals(2334d, NumberUtil.roundDown(nbr));
		
		Assert.assertEquals(2334d, NumberUtil.round(nbr));
		Assert.assertEquals(2334d, NumberUtil.round(2334.45d));
		Assert.assertEquals(2335d, NumberUtil.round(2334.50d));
		Assert.assertEquals(2335d, NumberUtil.round(2334.87d));
		
		Assert.assertEquals(-2334d, NumberUtil.round(-2334.45d));
		Assert.assertEquals(-2335d, NumberUtil.roundUp(-2334.50d));
		Assert.assertEquals(-2334d, NumberUtil.roundDown(-2334.50d));
		
		NumberUtil.round(null);
		
	}
}
