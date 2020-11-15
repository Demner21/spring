package pe.com.demneru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@ComponentScan( { "pe.com.demneru" } )
//@PropertySource( "classpath:src/main/resources/demo.properties" )
public class AppConfig{
  
  // al poner file:Test_SH_ProcesaTareaProg.properties, se indica que el archivo Test_SH_ProcesaTareaProg.properties se
  // encuentra en
  // la raiz del proyecto
  // si se pone classpath: el archivo debe ubicarse en la carpeta src/main/resources
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  public static void main( String[] args ){
    SpringApplication.run( AppConfig.class, args );
  }
}
