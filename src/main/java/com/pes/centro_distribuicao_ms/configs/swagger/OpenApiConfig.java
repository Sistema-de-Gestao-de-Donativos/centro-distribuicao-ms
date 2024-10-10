package com.pes.centro_distribuicao_ms.configs.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API de Centro de Distribuição",
        version = "1.0.0",
        description = "API para os serviços de centro de distribuição de donativos"
))
public class OpenApiConfig {
    // Outras configurações específicas podem ser adicionadas aqui.
    
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }
}
