package sandeep.simplespringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class SimpleSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringProjectApplication.class, args);
	}

	@Bean @ConditionalOnMissingBean(BuildProperties.class)
	BuildProperties buildProperties() {
		return new BuildProperties(new Properties());
	}
}
