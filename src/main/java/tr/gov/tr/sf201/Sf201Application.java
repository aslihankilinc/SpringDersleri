package tr.gov.tr.sf201;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import tr.gov.tr.sf201.di.Araba;

@SpringBootApplication
public class Sf201Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context=
        SpringApplication.run(Sf201Application.class, args);
        Araba araba=context.getBean(Araba.class);
        araba.baslat();
    }


}
