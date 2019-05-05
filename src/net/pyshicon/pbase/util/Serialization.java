package net.pyshicon.pbase.util;

import java.io.*;

public class Serialization {

    public static void string(String file, String string) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(string);
        out.flush();
    }

    public static String destring(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        String string = in.readObject().toString();
        in.close();
        return string;
    }
}
