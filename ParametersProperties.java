package pe.com.claro.sh.procesatareaprog.util.properties;

import org.apache.log4j.Logger;

public class ParametersProperties{
  
  private static Logger                  log        = Logger.getLogger( ParametersProperties.class.getName() );
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
