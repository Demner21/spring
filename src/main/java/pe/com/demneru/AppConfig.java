package pe.com.demneru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@ComponentScan( { "pe.com.demneru" } )
@PropertySource( "classpath:application.properties" )
public class AppConfig{
  
  // al poner file:application.properties, se indica que el archivo application.properties se
  // encuentra en la raiz del proyecto
  // si se pone classpath: el archivo debe ubicarse en la carpeta src/main/resources
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  public static void main( String[] args ){
    SpringApplication.run( AppConfig.class, args );
  }
}
