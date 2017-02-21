package com.goulding.connor.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.goulding.connor.dao.FileBasedLineDao;
import com.goulding.connor.dao.LineDao;
import com.goulding.connor.repository.DomainToDtoTransformer;
import com.goulding.connor.repository.DtoToDomainTransformer;
import com.goulding.connor.repository.LineRepository;
import com.goulding.connor.repository.PersistedLineRepository;
import com.goulding.connor.service.DefaultLineService;
import com.goulding.connor.service.LineService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by connor on 14/02/17.
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:META-INF/spring/stack-service/stack-service.properties")
})
public class StackConfig {

    @Value("${stack.linedao.file.location}")
    private String location;

    @Bean
    public LineService lineService() {
        return new DefaultLineService(lineRepository());
    }

    @Bean
    public LineRepository lineRepository() {
        return new PersistedLineRepository(lineDao(), dtoToDomainTransformer(), domainToDtoTransformer());
    }

    private LineDao lineDao() {
        return new FileBasedLineDao(location, new ObjectMapper());
    }

    private DtoToDomainTransformer dtoToDomainTransformer() {
        return new DtoToDomainTransformer();
    }

    private DomainToDtoTransformer domainToDtoTransformer() {
        return new DomainToDtoTransformer();
    }
}
