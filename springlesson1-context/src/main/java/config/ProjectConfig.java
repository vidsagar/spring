package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//the following is stereotype annotation
@ComponentScan(basePackages = "beans") // tell config to look in the beans package for component
//configuration is empty so context is empty
//bean needs to be added 

public class ProjectConfig {
}