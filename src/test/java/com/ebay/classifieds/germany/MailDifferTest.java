package com.ebay.classifieds.germany;

import org.junit.Test;

import java.io.IOException;
import java.util.Stack;

import static com.ebay.classifieds.germany.Mail.Role.BUYER;
import static com.ebay.classifieds.germany.SampleReader.readFileContents;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MailDifferTest {

    private MessageExtractor messageExtractor = new MessageExtractor();

    @Test
    public void stripsStandardTemplate() throws IOException {

        Mail input = new Mail(
                readFileContents("/mail-1.txt"),
                BUYER);

        // THIS ONE IS FAILING -> MAKE IT PASS
        assertThat(messageExtractor.extractText(input, new Stack<Mail>()),
                is("Hello! I just saw this ticket and wanted to ask if it is still available?"));
    }

    @Test
    public void diffMail_1_With_2() {
       // ....
    }

    /*
         Go on with more tests, refactor everything you like (TEST-CLASSES + PRODUCTION CODE)
     */




}
