package com.ebay.classifieds.germany;

import org.junit.Test;

import java.io.IOException;
import java.util.Stack;

import static com.ebay.classifieds.germany.Mail.Role.BUYER;
import static com.ebay.classifieds.germany.SampleReader.readFileContents;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExampleTest {

    private MessageExtractor messageExtractor = new MessageExtractor();

    @Test
    public void stripsStandardTemplate() throws IOException {

        Mail input = new Mail(
                readFileContents("/sample-first-mail.txt"),
                BUYER);

        assertThat(messageExtractor.extractText(input, new Stack<Mail>()),
                is("Hello! I just saw this ticket and wanted to ask if it is still available?"));
    }

}
