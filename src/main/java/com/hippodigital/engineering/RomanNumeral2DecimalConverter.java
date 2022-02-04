package com.hippodigital.engineering;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A Utility Class for converting Roman Numerals to their decimal equivalent
 */
public final class RomanNumeral2DecimalConverter {
	
	private static final String NULL_ROMAN_NUMERAL_EXCEPTION_MESSAGE = "The provided Roman Numeral was Null";
	private static final String EMPTY_ROMAN_NUMERAL_EXCEPTION_MESSAGE = "The provided Roman Numeral was Empty";
	private static final String INVALID_CHARACTER_EXCEPTION_MESSAGE = "The provided Roman Numeral has an invalid character '%s' at index: %s";
	
	/**
	 * Holds the mapping for each Roman Numeral Character and it's decimal value
	 */
	private static final Map<Character, Integer> romanNumeralCharacterDecimalValueMap;
	
	static {
		romanNumeralCharacterDecimalValueMap = new HashMap<>() {
			private static final long serialVersionUID = 1L;

			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
	}
	
	private RomanNumeral2DecimalConverter() {
		// Is now a static utility class
	}

	/**
	 * Converted the provided Roman Numeral to its equivalent decimal value
	 * 
	 * @param romanNumeral - the Roman Numeral to be converted
	 * @return the converted decimal value
	 */
	public static long toDecimal(String romanNumeral) {
		Objects.requireNonNull(romanNumeral, NULL_ROMAN_NUMERAL_EXCEPTION_MESSAGE);
		
		if (romanNumeral.isEmpty()) {
			throw new RuntimeException(EMPTY_ROMAN_NUMERAL_EXCEPTION_MESSAGE);
		}
		
		long decimalValue = 0;
		
		long subtractionValue = 0;
		
		char[] romanNumeralCharacters = romanNumeral.toCharArray();
		
		int romanNumeralCharacterLength = romanNumeralCharacters.length;
		
		for (int nextCharIndex = 0; nextCharIndex < romanNumeralCharacterLength; nextCharIndex++) {
			char aCharacter = romanNumeralCharacters[nextCharIndex];
			
			boolean imLast = nextCharIndex == (romanNumeralCharacterLength -1);
			
			if (!romanNumeralCharacterDecimalValueMap.containsKey(aCharacter)) {
				throw new RuntimeException(String.format(INVALID_CHARACTER_EXCEPTION_MESSAGE, aCharacter, nextCharIndex));
			}
			
			int charDecimalValue = romanNumeralCharacterDecimalValueMap.get(aCharacter); 
			
			if (!imLast) {
				char nextCharacter = romanNumeralCharacters[nextCharIndex+1];
				
				if (!romanNumeralCharacterDecimalValueMap.containsKey(nextCharacter)) {
					throw new RuntimeException(String.format(INVALID_CHARACTER_EXCEPTION_MESSAGE, nextCharacter, nextCharIndex+1));
				}
				
				int nextCharDecimalValue = romanNumeralCharacterDecimalValueMap.get(nextCharacter);
				
				if (charDecimalValue < nextCharDecimalValue) {
					subtractionValue += charDecimalValue;
				} else {
					decimalValue += charDecimalValue;
				}
			} else {
				decimalValue += charDecimalValue;
			}
		}
		
		return decimalValue - subtractionValue;
	}

}
