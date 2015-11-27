package com.omacias.numberutils;

/**
 * 26 Nov,2015
 * 
 * Number Utils
 * 
 * @author Macias, Salvador (salvador.macias.91@gmail.com)
 *
 */
public class NumberUtil {

	/**
	 * Zero value
	 */
	public static final Integer ZERO = 0;
	
	/**
	 * one value
	 */
	public static final Integer ONE = 1;
	
	/**
	 * half value
	 */
	public static final Float HALF = 0.5f;
	
	/**
	 * round up the given double
	 * @param nbr
	 * @return rounded double
	 */
	public static Double roundUp(Double nbr)throws NullPointerException{
		Boolean negative = false;
		if(nbr < ZERO){
			negative = true;
			nbr = getAbsolute(nbr);
		}
		Double ret = 0d;
		Double fractionalPart = nbr % ONE;
		Double integerPart = nbr - fractionalPart;
		
		if(fractionalPart == (double)ZERO){
			ret = nbr;
		}else{
			ret = integerPart + 1;
		}
		
		if(negative)
			return ret * -ONE;
		return ret;
	}
	
	/**
	 * round down the given number, or basically skip decimals
	 * @param nbr
	 * @return rounded double
	 */
	public static Double roundDown(Double nbr)throws NullPointerException{
		Boolean negative = false;
		if(nbr < ZERO){
			negative = true;
			nbr = getAbsolute(nbr);
		}
		
		Double ret = 0d;
		Double fractionalPart = nbr % ONE;
		ret = nbr - fractionalPart;
		if(negative)
			return ret * -ONE;
		return ret;
	}
	
	/**
	 * round the given double
	 * @param nbr
	 * @return
	 */
	public static Double round(Double nbr)throws NullPointerException{
		Boolean negative = false;
		if(nbr < ZERO){
			negative = true;
			nbr = getAbsolute(nbr);
		}
		
		Double ret = 0d;
		Double fractionalPart = nbr % ONE;
		Double integerPart = nbr - fractionalPart;
		
		if(fractionalPart == (double)ZERO){
			ret = nbr;
		}else if(fractionalPart >= HALF){
			ret = integerPart + 1;
		}else{
			ret = integerPart;
		}
		
		if(negative)
			return ret * -ONE;
		return ret;
	}
	
	private static Double getAbsolute(Double nbr){
		if(nbr < ZERO){
			return nbr * -ONE;
		}
		return nbr;
	}
}
