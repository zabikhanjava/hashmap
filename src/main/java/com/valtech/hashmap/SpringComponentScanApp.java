package com.valtech.hashmap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.valtech.hashmap")
@PropertySource("classpath:/application.properties")
public class SpringComponentScanApp {


  @Bean
  public String some()
  {
    return "some";
  }
  @Bean
  public String pome()
  {
    return "pome";
  }

}