/**
 * Classes supporting cardservices operations at The Bank of Random Credit.
 *
 * <p>
 * This package contains an example class, the BankOfRandomCreditAuthorizer that will decide randomly
 * if a card purchase should be allowed or not. Definiately a non-deterministic situation, which is
 * designed to cause failure when used as a dependency during testing :)
 * </p>
 * <p>
 * Look for the peer class AlwaysAuthorize in the package com.everyoneisauthorized.authorize from the Everyone
 * is Authorized card authorization service company, which authorizes every purchase regardless of the card
 * having any available credit.
 * </p>
 */
package com.thebankofrandomcredit.cardservices;