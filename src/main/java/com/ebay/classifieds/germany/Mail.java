package com.ebay.classifieds.germany;


public class Mail {

    private final String mailContents;


    public Mail(String mailContents) {
        if (mailContents == null) {
            throw new IllegalArgumentException("all parameters are mandatory");
        }
        this.mailContents = mailContents;
    }

    public String getMailContents() {
        return mailContents;
    }
}
