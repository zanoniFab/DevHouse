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
import tech.devinhouse.ex01s10api_copadomundo.model.Posicao;
import tech.devinhouse.ex01s10api_copadomundo.model.Selecao;
import tech.devinhouse.ex01s10api_copadomundo.service.SelecaoService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ex01S10ApiCopadomundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex01S10ApiCopadomundoApplication.class, args);
	}
//	@Bean
//	CommandLineRunner run(SelecaoService selecaoService) {
//		return args -> {
//			List<Selecao> lista = selecaoService.consultar("BRA",2,0,"ASC");
//			if (lista.isEmpty()) {
//				List<Jogador> jogadorBrasil = new ArrayList<>();
//				jogadorBrasil.add(new Jogador(1,"Cristiane", Posicao.ATACANTE));
//				jogadorBrasil.add(new Jogador(2,"Marta", Posicao.ATACANTE));
//				jogadorBrasil.add(new Jogador(3,"Tamires", Posicao.LATERAL));
//				selecaoService.inserir(new Selecao("BRA", "Brasil", "G", LocalDateTime.now(),jogadorBrasil));
//				List<Jogador> jogadorCanada = new ArrayList<>();
//				jogadorCanada.add(new Jogador(1,"Indio Cuiudo", Posicao.ATACANTE));
//				jogadorCanada.add(new Jogador(2,"Girafon", Posicao.ZAGUEIRO));
//				jogadorCanada.add(new Jogador(3,"Guri Pradie", Posicao.LATERAL));
//				selecaoService.inserir(new Selecao("ENG", "Canada", "H", LocalDateTime.now(),jogadorCanada));
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