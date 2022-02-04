package com.hippodigital.engineering;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeral2DecimalConverterTest {
	
	// Test Simple Roman Numerals

	@Test
	public void testConversionOfRomanNumeral_I_to_1() {
		String romanNumeral = "I";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(1L, decimal);
	}

	@Test
	public void testConversionOfRomanNumeral_V_to_5() {
		String romanNumeral = "V";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(5L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_X_to_10() {
		String romanNumeral = "X";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(10L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_L_to_50() {
		String romanNumeral = "L";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(50L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_C_to_100() {
		String romanNumeral = "C";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(100L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeralD_to_500() {
		String romanNumeral = "D";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(500L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_M_to_1000() {
		String romanNumeral = "M";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(1000L, decimal);
	}
	
	// Test Subtraction Cases in Roman Numerals
	
	// Test Subtraction Cases of -1
	
	@Test
	public void testConversionOfRomanNumeral_IV_to_4() {
		String romanNumeral = "IV";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(4L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_IX_to_9() {
		String romanNumeral = "IX";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(9L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_IL_to_49() {
		String romanNumeral = "IL";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(49L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_IC_to_99() {
		String romanNumeral = "IC";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(99L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_ID_to_499() {
		String romanNumeral = "ID";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(499L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_IM_to_999() {
		String romanNumeral = "IM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(999L, decimal);
	}
	
	// Test Subtraction Cases of -5
	
	@Test
	public void testConversionOfRomanNumeral_VX_to_5() {
		String romanNumeral = "VX";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(5L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_VL_to_45() {
		String romanNumeral = "VL";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(45L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_VC_to_95() {
		String romanNumeral = "VC";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(95L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_VD_to_495() {
		String romanNumeral = "VD";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(495L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_VM_to_995() {
		String romanNumeral = "VM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(995L, decimal);
	}
	
	// Test Subtraction Cases of -10
	
	@Test
	public void testConversionOfRomanNumeral_XL_to_40() {
		String romanNumeral = "XL";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(40L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_XC_to_90() {
		String romanNumeral = "XC";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(90L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_XD_to_490() {
		String romanNumeral = "XD";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(490L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_XM_to_990() {
		String romanNumeral = "XM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(990L, decimal);
	}
	
	// Test Subtraction Cases of -50
	
	@Test
	public void testConversionOfRomanNumeral_LC_to_50() {
		String romanNumeral = "LC";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(50L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_LD_to_450() {
		String romanNumeral = "LD";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(450L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_LM_to_950() {
		String romanNumeral = "LM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(950L, decimal);
	}
	
	// Test Subtraction Cases of -100
	
	@Test
	public void testConversionOfRomanNumeral_CD_to_400() {
		String romanNumeral = "CD";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(400L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_CM_to_900() {
		String romanNumeral = "CM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(900L, decimal);
	}
	
	// Test Subtraction Cases of -500
	
	@Test
	public void testConversionOfRomanNumeral_DM_to_500() {
		String romanNumeral = "DM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(500L, decimal);
	}
	
	// Test Complex Roman Numerals
	
	@Test
	public void testConversionOfRomanNumeral_XXDD_to_1000() {
		String romanNumeral = "XXDD";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.assertEquals(1000L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_CMXCVIII_to_998() {
		String romanNumeral = "CMXCVIII";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		// C = -100, M = 1000, X = -10, C = 100, VIII = 8
		
		Assert.assertEquals(998L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_IVXLCDM_to_334() {
		String romanNumeral = "IVXLCDM";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		// I = -1, V = -5, X = -10, L = -50, C = -100, D = -500, M = 1000
		
		Assert.assertEquals(334L, decimal);
	}
	
	@Test
	public void testConversionOfRomanNumeral_XCDXDXLDIII_to_1323() {
		String romanNumeral = "XCDXDXLDIII";
		
		long decimal = RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		// X = -10, C = -100, D = 500, X = -10, D = 500, X = -10, L = -50, DIII = 503  
		
		Assert.assertEquals(1323L, decimal);
	}
	
	// Test Null Roman Numeral (Return Null Pointer Exception)
	
	@Test(expected = NullPointerException.class)
	public void testConversionOfNullRomanNumeral() {
		String romanNumeral = null;
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an exception, because null values are invalid Roman Numerals");
	}
	
	// Test Empty Roman Numeral (Return Runtime Exception)
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfEmptyRomanNumeral() {
		String romanNumeral = "";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an exception, because empty strings are invalid Roman Numerals");
	}
	
	// Test Invalid Roman Numeral (Checks should determine if it is valid)
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfInvalidRomanNumeral_XM_Space() {
		String romanNumeral = "XM ";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an exception, because space characters are invalid Roman Numeral characters");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfInvalidRomanNumeral_Minus_VIII() {
		String romanNumeral = "-VIII";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an exception, because the minus (-) character is invalid Roman Numeral characters");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfInvalidRomanNumeral_X_CD_XD_XL_DIII() {
		String romanNumeral = "X CD XD XL DIII";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an exception, because space characters are invalid Roman Numeral characters");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfInvalidRomanNumeral_IX1V2C3D() {
		String romanNumeral = "IX1V2C3D";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an error, because decimal digits are invalid Roman Numeral characters");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConversionOfInvalidRomanNumeral_xxiii() {
		String romanNumeral = "xxiii";
		
		RomanNumeral2DecimalConverter.toDecimal(romanNumeral);
		
		Assert.fail("Should have thrown an error, because lowercase representations aren't valid Roman Numeral characters");
	}
}

