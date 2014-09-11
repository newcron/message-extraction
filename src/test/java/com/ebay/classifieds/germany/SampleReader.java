package com.ebay.classifieds.germany;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class SampleReader {
    public static String readFileContents(String filename) {
        try(InputStream i = SampleReader.class.getResourceAsStream(filename)) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[100];
            int bytesRead = 0;
            while((bytesRead = i.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            return new String(output.toByteArray(), Charset.forName("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
