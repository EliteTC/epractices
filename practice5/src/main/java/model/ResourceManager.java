package model;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourseName = "text";
    ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourseName, Locale.getDefault());

    }

    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourseName, locale);

    }
    public String getValue(String key) {
        return new String(resourceBundle.getString(key));
    }
    public Enumeration getSetKey() {
        return resourceBundle.getKeys();
    }
}