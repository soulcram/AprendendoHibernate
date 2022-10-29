package br.com.m3Tech.AprendendoHibernate.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EntityScan(basePackages = "br.com.m3Tech.AprendendoHibernate.model")
@EnableJpaRepositories(basePackages = "br.com.m3Tech.AprendendoHibernate.repositories")
@EnableAsync
public class ConfigBean {


}
