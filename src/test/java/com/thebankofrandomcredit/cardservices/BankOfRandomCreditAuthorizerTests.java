// BankOfRandomCreditAuthorizerTests.java
// Copyright © 2020 Joel Mussman. All rights reserved.
//

package com.thebankofrandomcredit.cardservices;

import com.wonderfulwidgets.retail.ICreditCardValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.math.BigDecimal;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BankOfRandomCreditAuthorizerTests {

    @Mock
    ICreditCardValidator cardValidator;

    /**
     * Verifies the requirement that the credit card validator is actually used
     * and passed the card number by using Mockito to verify the call.
     */
    @Test
    public void UsesCreditCardValidator() {

        String cardNumber = "1234";
        BankOfRandomCreditAuthorizer authorizer = new BankOfRandomCreditAuthorizer(cardValidator);

        when(cardValidator.validateCardNumber(cardNumber)).thenReturn(false);

        authorizer.purchase(cardNumber, BigDecimal.valueOf(100.0));

        verify(cardValidator, times(1)).validateCardNumber(cardNumber);
    }
}
