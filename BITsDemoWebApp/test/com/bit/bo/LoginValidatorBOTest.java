package com.bit.bo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginValidatorBOTest {

	private static final String INVALID_CREDENTIALS = "test";
	private static final String VALID_CREDENTIALS = "bharath";

	@Test
	public void testValidate_ReturnsTrueWhenValid() {
		LoginValidatorBO loginValidatorBO = new LoginValidatorBO();
		assertTrue(loginValidatorBO.validate(VALID_CREDENTIALS,
				VALID_CREDENTIALS));
	}

	@Test
	public void testValidate_ReturnsFalseWhenNotValid() {
		LoginValidatorBO loginValidatorBO = new LoginValidatorBO();
		assertFalse(loginValidatorBO.validate(INVALID_CREDENTIALS,
				INVALID_CREDENTIALS));
	}

}
