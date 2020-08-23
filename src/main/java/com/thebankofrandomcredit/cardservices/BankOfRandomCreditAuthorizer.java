// BankOfRandomCreditAuthorizer.java
// Copyright © 2020 Joel Mussman. All rights reserved.
//

package com.thebankofrandomcredit.cardservices;

import com.wonderfulwidgets.retail.CreditCardValidator;
import com.wonderfulwidgets.retail.ICreditCardValidator;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

/**
 * Client interface to the credit card processing services for the Bank of Random Credit.
 */
public class BankOfRandomCreditAuthorizer {

    ICreditCardValidator creditCardValidator = new CreditCardValidator();

    /**
     * Create an authorizer using an instance of CreditCardValidator.
     */
    public BankOfRandomCreditAuthorizer() {

        creditCardValidator = new CreditCardValidator();
    }

    /**
     * Create an authorizer using a provided credit card validator.
     *
     * @param creditCardValidator The ICreditCardValidator instance to use.
     */
    public BankOfRandomCreditAuthorizer(ICreditCardValidator creditCardValidator) {

        this.creditCardValidator = creditCardValidator;
    }

    /**
     * If an invalid card number is presented the card will always be rejected.
     * Otherwide the odds are fifty-fifty that a charge to a credit cards is approved. Randomness
     * is the foundation of our bank, so if we give you credit or not just depends on a roll of the dice.
     *
     * @param cardNumber The card number to charge.
     * @param amount The amount to charge.
     * @return A unique token tied to the transaction if the charge is allowed, or null if it is not.
     */
    public String purchase(String cardNumber, BigDecimal amount) {

        String result = null;

        try {

            if (creditCardValidator.validateCardNumber(cardNumber) && Math.random() < 0.5) {

                result = UUID.randomUUID().toString();
            }
        }

        catch (NullPointerException e) {

            // Do nothing, null will be returned as a failure to purchase.
        }

        return result;
    }
}
