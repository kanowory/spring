package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springwprowadzenie.model.Silnik;
@EnableConfigurationProperties(MojeProperties.class)
@Configuration
public class ApplicationConfiguration {



    /*@Bean("SuperDiesel3000")
    public Silnik silnik1(){
        return new Silnik();
    }
    @Bean
    public Silnik silnik2(){
        return new Silnik();
    }
    @Bean
    public Silnik silnik3(){
        return new Silnik();
    }*/

}
