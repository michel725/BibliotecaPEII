package Propiedades;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Propiedad {
    public static Properties getProp() {
        try {
            Properties prop = new Properties();
            prop.load(Propiedad.class.getResourceAsStream("DB.properties"));
            return prop;
        } catch (IOException ex) {
            Logger.getLogger(Propiedad.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
