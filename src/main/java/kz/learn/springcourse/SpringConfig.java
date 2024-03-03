package kz.learn.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.learn.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
