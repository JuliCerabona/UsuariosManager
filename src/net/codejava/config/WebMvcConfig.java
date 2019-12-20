package net.codejava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
//Esta clase tiene la annotation @Configuration para decirle al framework Spring que esta es una clase de configuración
//En esta clase se crea como un controlador de vistas que especifica el prefijo y sufijo de los archivos de vistas.


@Configuration
@ComponentScan("net.codejava ")
public class WebMvcConfig {
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}