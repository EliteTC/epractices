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
        try {
            return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Enumeration getSetKey() {
        return resourceBundle.getKeys();
    }
}