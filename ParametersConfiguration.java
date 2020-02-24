package pe.com.claro.sh.procesatareaprog.util.properties;

import java.io.FileInputStream;
import java.io.InputStream;

import java.util.Properties;

import org.apache.log4j.Logger;

public class ParametersConfiguration {
    
    static private Properties properties = null;
    static private InputStream is = null;
    static private ParametersConfiguration pp = null;
    private static Logger logger =
        Logger.getLogger(ParametersConfiguration.class.getName());
    
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
