package pe.com.demneru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class MaingetEnvironment{
  
  public static void main( String[] args ){
    //ConfigurableApplicationContext objContextoSpring = new ClassPathXmlApplicationContext( Constantes.CONFIG_PATH );
    ApplicationContext objContextoSpring=null;
    try {
    objContextoSpring = new AnnotationConfigApplicationContext(AppConfig.class);
    Environment env = objContextoSpring.getEnvironment();
    System.out.println( "env is -->" + env );
    System.out.println( "env is -->" + env.getProperty( "my.codigo" ) );
    boolean containsFoo = env.containsProperty( "my.codigo" );
    System.out.println( "Does my environment contain the 'my.codigo' property? " + containsFoo );
    }finally{
      ((AnnotationConfigApplicationContext) objContextoSpring).close();
    }
  }
}
