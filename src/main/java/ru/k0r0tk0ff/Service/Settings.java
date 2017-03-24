package ru.k0r0tk0ff.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringJoiner;

/**
 * Created by user on 3/24/2017.
 * @author Petr Arsentev
 * @version $Id$
 * @since 0.1
 */

public class Settings {

    /**
    * Class Properties use to bind "key" and "value"
    */
    public final Properties properties = new Properties();

    public void load(InputStream io) {
        try {
            this.properties.load(io);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public String getValue(String key) {
        return this.properties.getProperty(key);
    }
}
