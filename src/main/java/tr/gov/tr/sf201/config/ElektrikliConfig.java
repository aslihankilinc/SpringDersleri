package tr.gov.tr.sf201.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tr.gov.tr.sf201.di.Motor;


@Configuration
@Profile("elektrikli")
public class ElektrikliConfig {
    @Bean
    public Motor motor(){
        return  new Motor("Elektrikli");
    }
}
