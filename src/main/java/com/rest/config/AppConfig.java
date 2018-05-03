package com.rest.config;
  
import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration 
@ComponentScan("com.rest")
@EnableWebMvc
@EnableSwagger2
public class AppConfig {
    @Bean
    public Docket postsApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().apiInfo(apiInfo());
        docket.useDefaultResponseMessages(false);
        return docket;
    }

    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/api/javainuse.*"), regex("/api/location"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Swagger Test API")
                .description("Test Swagger Documentation")
                .version("1.0").build();
    }
}  
