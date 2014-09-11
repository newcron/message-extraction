package com.ebay.classifieds.germany;

import java.util.Stack;

public class MessageExtractor {
    /**
     * extract the actual text of the mail from parameter <code>actualMail</code>. the second parameter, <code>history</code>
     * will contain the previous messages in this conversation (from both people involved).
     * <p>
     * The stack will be filled with messages in the order they arrived. Meaning the first message of the conversation
     * is added to the stack first. The <code>actualMail</code> will not be in the stack.
     */
    public String extractText(Mail actualMail, Stack<Mail> history) {
        return actualMail.getMailContents();
    }
}
