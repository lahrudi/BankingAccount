package com.bank.assessment.exception;

import java.text.MessageFormat;

/**
 * @author Alireza Gholamzadeh Lahroodi
 */
public class NotFoundException extends RuntimeException
{
    public NotFoundException(Long accountNumber) {
        super(MessageFormat.format("Could not find Account with id: {0}", accountNumber));
    }
}
