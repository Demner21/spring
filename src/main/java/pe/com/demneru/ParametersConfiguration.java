package pe.com.demneru;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParametersConfiguration {
    
    static private Properties properties = null;
    static private InputStream is = null;
    static private ParametersConfiguration pp = null;
    private static final Logger logger = LoggerFactory.getLogger(ParametersConfiguration.class);
    static public ParametersConfiguration getSingleton(String prop) {
        if (pp == null) {
            try {
                pp = new ParametersConfiguration();
                properties = new Properties();
                is = new FileInputStream(prop);
                properties.load(is);
                is.close();
                logger.info("Se cargaron los datos del properties: " + prop);
            } catch (Exception e) {
                logger.error("No se cargaron los datos del properties: " +
                             e.toString(),e);
            }
        }
        return pp;
    }
    
    public String getValor(String variable) {
        try {
        		return properties.get(variable).toString();
        } catch (Exception e) {
            logger.error("Error cargando variable desde el properties:"+variable+". Detalle:"+e.toString());
            return "";
        }
    }
}
