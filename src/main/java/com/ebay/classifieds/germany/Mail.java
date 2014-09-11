package com.ebay.classifieds.germany;

import static com.ebay.classifieds.germany.Mail.Role.BUYER;
import static com.ebay.classifieds.germany.Mail.Role.SELLER;

public class Mail {

    public static enum Role {BUYER, SELLER}

    private final String mailContents;
    private final Role from;


    public Mail(String mailContents, Role from) {
        if (from == null || mailContents == null) {
            throw new IllegalArgumentException("all parameters are mandatory");
        }
        this.mailContents = mailContents;
        this.from = from;
    }

    public String getMailContents() {
        return mailContents;
    }

    public Role getFrom() {
        return from;
    }

    public Role getTo() {
        return from == BUYER ? SELLER : BUYER;
    }
}
