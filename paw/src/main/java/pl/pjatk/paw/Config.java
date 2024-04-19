package pl.pjatk.paw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public POJO pojo(){
        return new POJO();
    }

    @Bean
    public List<String> defaultData(@Value("${my.custom.property:gownooooo}") String valueFromProperties) {
        System.out.println(valueFromProperties);
        return List.of("dupa1", "dupa2", "dupa3", "dupa4", "dupa5");
    }
}
