package org.hibernate.utils;

import java.io.FileInputStream;
import java.io.IOException;

public class Utils {

    public static byte[] readImage(String filePath) {
        try (FileInputStream stream = new FileInputStream(filePath)) {
            byte[] data = new byte[stream.available()];
            stream.read(data);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
