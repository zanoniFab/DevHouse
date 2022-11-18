package tech.devinhouse.ex01s10api_copadomundo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.ex01s10api_copadomundo.model.Jogador;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.service.SelecaoService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Ex01S10ApiCopadomundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex01S10ApiCopadomundoApplication.class, args);
	}
//	@Bean
//	CommandLineRunner run(SelecaoService selecaoService) {
//		return args -> {
//			List<Selecao> lista = selecaoService.consultar("BRA", "BRASIL", "H", "ASC",3,0,"nome");
//			if (lista.isEmpty()) {
//				selecaoService.inserir(new Selecao("CAM", "Camaroes", LocalDate.now().minusYears(20),(new Jogador());
//
//			}
//		};
//	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}