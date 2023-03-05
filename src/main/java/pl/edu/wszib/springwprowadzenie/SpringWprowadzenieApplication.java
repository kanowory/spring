package pl.edu.wszib.springwprowadzenie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import pl.edu.wszib.springwprowadzenie.configuration.MojeProperties;
import pl.edu.wszib.springwprowadzenie.model.Samochod;
import pl.edu.wszib.springwprowadzenie.model.Silnik;

@SpringBootApplication
public class SpringWprowadzenieApplication implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext context;
    private static final Logger logger = LoggerFactory.getLogger(SpringWprowadzenieApplication.class);

    @Autowired
    private Silnik silnik;

    @Autowired
    private Samochod samochod;

    @Autowired
    private MojeProperties mojeProperties;

    @Bean
    public String cos(Samochod samochod){
        return samochod.toString();
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringWprowadzenieApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        samochod.odpal();
        silnik.zepsuj();
        samochod.odpal();

        System.out.println(mojeProperties.getPassword());
        System.out.println(mojeProperties.getUrl());
        System.out.println(mojeProperties.getUsername());
        System.out.println(mojeProperties.getDodatkowe().getPierwszy());
        System.out.println(mojeProperties.getDodatkowe().getDrugi());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
