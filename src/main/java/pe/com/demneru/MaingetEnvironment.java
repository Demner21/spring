package pe.com.demneru;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import pe.com.demneru.util.Constantes;

public class MaingetEnvironment{
  
  public static void main( String[] args ){
    ConfigurableApplicationContext objContextoSpring = new ClassPathXmlApplicationContext( Constantes.CONFIG_PATH );
    Environment env = objContextoSpring.getEnvironment();
    System.out.println( "env is -->" + env );
    System.out.println( "env is -->" + env.getProperty( "idf.0.codigo" ) );
    boolean containsFoo = env.containsProperty( "idf.0.codigo" );
    System.out.println( "Does my environment contain the 'foo' property? " + containsFoo );
  }
}
