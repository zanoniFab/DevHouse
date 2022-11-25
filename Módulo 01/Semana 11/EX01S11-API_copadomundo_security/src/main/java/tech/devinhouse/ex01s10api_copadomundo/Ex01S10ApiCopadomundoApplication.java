package tech.devinhouse.ex01s10api_copadomundo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.ex01s10api_copadomundo.model.*;
import tech.devinhouse.ex01s10api_copadomundo.service.SelecaoService;
import tech.devinhouse.ex01s10api_copadomundo.service.UsuarioService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Ex01S10ApiCopadomundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex01S10ApiCopadomundoApplication.class, args);
	}
		@Bean
		public MessageSource messageSource() {
			ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
			messageSource.setBasename("classpath:messages");
			messageSource.setDefaultEncoding("UTF-8");
			return messageSource;
		}
		@Bean
		public LocalValidatorFactoryBean validator() {
			LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
			bean.setValidationMessageSource(messageSource());
			return bean;
		}
		@Bean
		public ModelMapper modelMapper() {
			ModelMapper modelMapper = new ModelMapper();
			return modelMapper;
		}

		@Bean
		public PasswordEncoder obterPasswordEncoder() {
			return new BCryptPasswordEncoder();
		}

}