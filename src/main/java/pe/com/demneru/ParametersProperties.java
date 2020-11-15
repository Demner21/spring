package pe.com.demneru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParametersProperties{
  
  private static final Logger log = LoggerFactory.getLogger(ParametersProperties.class);  
  
  private static ParametersConfiguration propConfig = null;
  
  public void cargarPropiedades(){
    try{
      if( propConfig == null ){
        cargarPropiedades( "C:\\gits\\Test_SH_ProcesaTareaProg\\Test_SH_ProcesaTareaProg.properties" );
      }
    }
    catch( Exception e ){
      log.error( "Error al cargarPropiedades: " + e.getMessage() );
    }
  }
  
  public void cargarPropiedades( String location ){
    try{
      propConfig = ParametersConfiguration.getSingleton( location );
    }
    catch( Exception e ){
      log.error( "Error al cargarPropiedades: " + e.getMessage() );
    }
  }
  
  public String getValor( String variable ){
    try{
      return propConfig.getValor( variable ).toString();
    }
    catch( Exception e ){
      return "";
    }
  }
}
