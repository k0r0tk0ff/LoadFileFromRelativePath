package ru.k0r0tk0ff.Service;

import org.junit.Test;
import org.hamcrest.CoreMathes.is;
import org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

/**
 * Created by user on 3/24/2017.
 */

public class SettingsTest {

    @Test
    public void whenLoadFromAbsolutePath () throws Exception {
        Settings settings = new Settings();
        File file = new File("c:\\Projects\\LoadFileFromRelativePath\\app.properties");
        try (FileInputStream io = new FileInputStream(file)) {
                settings.load(io);
        }
        String value = settings.getValue("home.path");
        assertThat(value, is("c:\\temp\\"));
    }
}