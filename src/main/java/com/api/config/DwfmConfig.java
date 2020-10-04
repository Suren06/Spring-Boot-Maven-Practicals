package com.api.config;

import java.util.Arrays;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing
@ComponentScan(basePackages = {"com.api.*"})
public class DwfmConfig {
	
	@Bean(name = "dwfmDozerBeanMapper")
	public DozerBeanMapper dockerMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<String> mappingFiles = Arrays.asList("dwfm-dozer-global-configuration.xml");
		mapper.setMappingFiles(mappingFiles);
		return mapper;
	}

}
