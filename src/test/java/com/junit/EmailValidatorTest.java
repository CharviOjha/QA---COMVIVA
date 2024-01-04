package com.junit;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailValidatorTest {

    private final EmailValidator emailValidator = new EmailValidator();

    @Test
    public void testIsValidEmail() {
        assertTrue(emailValidator.isValidEmail("test@example.com"));
        assertTrue(emailValidator.isValidEmail("user123@domain.co.uk"));
        assertTrue(emailValidator.isValidEmail("john.doe123@company.org"));
        assertFalse(emailValidator.isValidEmail("invalid.email"));
        assertFalse(emailValidator.isValidEmail("missing@tld."));
    }

    @Test
    public void testIsCorporateEmail() {
        assertTrue(emailValidator.isCorporateEmail("employee@company.com"));
        assertFalse(emailValidator.isCorporateEmail("user@gmail.com"));
        assertFalse(emailValidator.isCorporateEmail("manager@company.org.uk"));
    }

    @Test
    public void testIsValidEmailWithNull() {
        assertFalse(emailValidator.isValidEmail(null));
    }

    @Test
    public void testIsCorporateEmailWithNull() {
        assertFalse(emailValidator.isCorporateEmail(null));
    }

    @Test
    public void testIsValidEmailEdgeCases() {
        assertFalse(emailValidator.isValidEmail(""));
        assertFalse(emailValidator.isValidEmail(" "));
        assertFalse(emailValidator.isValidEmail("abc@"));
        assertFalse(emailValidator.isValidEmail("@domain.com"));
        assertFalse(emailValidator.isValidEmail("user@.com"));
    }
    /*
    @Test
    public void testIsCorporateEmailEdgeCases() {
        assertFalse(emailValidator.isCorporateEmail(""));
        assertFalse(emailValidator.isCorporateEmail(" "));
        assertFalse(emailValidator.isCorporateEmail("company.com"));
        assertFalse(emailValidator.isCorporateEmail("employee@company.org.uk"));
    }
    */
}
