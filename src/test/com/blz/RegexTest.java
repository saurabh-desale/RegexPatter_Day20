package com.blz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegexTest {

	RegistrationForm form = new RegistrationForm();

	@Test
	public void testNameValid_Success() {
		assertTrue(form.firstName("Saurabh"));
	}

	@Test
	public void testNameInValidStartCap_Fail() {
		assertFalse(form.firstName("saurabh"));
	}

	@Test
	public void testNameInvalidMinThreeCharacter_Fail() {
		assertFalse(form.firstName("Om"));
	}

	@Test
	public void testLastNameValid_Success() {
		assertTrue(form.lastName("Saurabh"));
	}

	@Test
	public void testLastNameInValidStartCap_Fail() {
		assertFalse(form.lastName("saurabh"));
	}

	@Test
	public void testLastNameInvalidMinThreeCharacter_Fail() {
		assertFalse(form.lastName("Om"));
	}

	@Test
	public void testEmailValid_Success() {
		assertTrue(form.userEmail("abc.xyz@bl.co.in"));
	}

	@Test
	public void testNumberValid_Success() {
		assertTrue(form.userNumber("91 9370636399"));
	}

	@Test
	public void testPassValid_Success() {
		assertTrue(form.userPass("Cristaino07@#"));
	}

	@Test
	public void testPassInvalidGap_Fail() {
		assertFalse(form.userPass("Cristaino 07@#"));
	}

	@Test
	public void testPassInvalidAtleastEightCharacter_Fail() {
		assertFalse(form.userPass("Cri07@#"));
	}

	@Test
	public void testPassInvalidOneUpperCase_Fail() {
		assertFalse(form.userPass("ristaino07@#"));
	}

	@Test
	public void testPassInvalidAtLeastOneNumericNumber_Fail() {
		assertFalse(form.userPass("Cristaino@#"));
	}

	@Test
	public void testPassInvalidAtLeastOneSpecialCharacter_Fail() {
		assertFalse(form.userPass("Cristaino012"));
	}

	@Test
	public void testEmail10Valid_Success() {
		assertTrue(form.userEmail("abc@yahoo.com"));
	}

	@Test
	public void testEmail2Valid_Success() {
		assertTrue(form.userEmail("abc-100@yahoo.com"));
	}

	@Test
	public void testEmail3Valid_Success() {
		assertTrue(form.userEmail("abc.100@yahoo.com"));
	}

	@Test
	public void testEmail4Valid_Success() {
		assertTrue(form.userEmail("abc111@abc.com"));
	}

	@Test
	public void testEmail5Valid_Success() {
		assertTrue(form.userEmail("abc-100@abc.net"));
	}

	@Test
	public void testEmail6Valid_Success() {
		assertTrue(form.userEmail("abc.100@abc.com.au"));
	}

	@Test
	public void testEmail7Valid_Success() {
		assertTrue(form.userEmail("abc@1.com"));
	}

	@Test
	public void testEmail8Valid_Success() {
		assertTrue(form.userEmail("abc@gmail.com.com"));
	}

	@Test
	public void testEmail9Valid_Success() {
		assertTrue(form.userEmail("abc+100@gmail.com"));
	}

	@Test
	public void testEmail2Valid_Fail() {
		assertFalse(form.userEmail("abc@.com.my"));
	}

	@Test
	public void testEmail3Valid_Fail() {
		assertFalse(form.userEmail("abc123@gmail.com.a"));
	}

	@Test
	public void testEmail4Valid_Fail() {
		assertFalse(form.userEmail("abc123@.com.com"));
	}

	@Test
	public void testEmail5Valid_Fail() {
		assertFalse(form.userEmail(".abc@abc.com"));
	}

	@Test
	public void testEmail6Valid_Fail() {
		assertFalse(form.userEmail("abc()*@gmail.com"));
	}

	@Test
	public void testEmail7Valid_Fail() {
		assertFalse(form.userEmail("abc@%*.com"));
	}

	@Test
	public void testEmail8Valid_Fail() {
		assertFalse(form.userEmail("abc..2002@gmail.com"));
	}

	@Test
	public void testEmail9Valid_Fail() {
		assertFalse(form.userEmail("abc.@gmail.com"));
	}

	@Test
	public void testEmail10Valid_Fail() {
		assertFalse(form.userEmail("abc@abc@gmail.com"));
	}

	@Test
	public void testEmail11Valid_Fail() {
		assertFalse(form.userEmail("abc@gmail.com.1a"));
	}

	@Test
	public void testEmail12Valid_Fail() {
		assertFalse(form.userEmail("abc@gmail.com.aa.au"));
	}

	@Test
	public void testEmailValid_Fail() {
		assertFalse(form.userEmail("abc"));
	}
}
