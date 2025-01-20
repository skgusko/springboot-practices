package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication { // Bootstrapping Class

	@Bean
	public Map<?,?> myMap() {
		return Map.of("greetings", "Hello World");
	}
	public static void main(String[] args) {
		/*
		ConfigurableApplicationContext ac = null;
		try {
			//ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행 - ex02.ExApplication
			ac = SpringApplication.run(ExApplication.class, args);
			System.out.println("ExApplication runs..." + ac.getBean("m", Map.class).get("greetings"));
		} catch(Exception ignored) {
			
		} finally {
			ac.close();
		}
		*/
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args);) {
			System.out.println("ExApplication runs..." + ac.getBean("m", Map.class).get("greetings"));
		}
	}
}
