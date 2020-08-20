// BRCAuthorizer.java
// Copyright © 2020 The Bank of Random Credit. All rights reserved.
//

package com.thebankofrandomcredit.authorizer;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

/**
 * This class is the client interface to the credit card authorization services for the Bank of Random Credit.
 */
public class BRCAuthorizer {

    Random random;

    public BRCAuthorizer() {

        random = new Random();
    }

    /**
     * The odds are fifty-fifty that a charge to one of our credit cards is approved or not. Randomness
     * is the foundation of our bank, so if we give you credit or not just depends on a roll of the dice.
     *
     * @param cardNumber The card number to charge.
     * @param amount The amount to charge.
     * @return A unique token tied to the transaction if the charge is allowed, or null if it is not.
     */
    public String purchase(String cardNumber, BigDecimal amount) {

        int random01 = random.nextInt(1);
        String result = null;

        if (random01 == 1) {

            result = UUID.randomUUID().toString();

        }

        return result;
    }
}
