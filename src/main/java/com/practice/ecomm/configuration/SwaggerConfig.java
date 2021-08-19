package com.practice.ecomm.configuration;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.practice.ecomm")).paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo getApiInfo() {
        Contact contact = new Contact("Saurabh", "http://blueyonder.com", "saurabh.rajpal@jda.com");
        return new ApiInfoBuilder().title("BookEcomm API")
                .description("Swagger API for BookEcomm").version("1.0.0-SNAPSHOT")
                .license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0").contact(contact)
                .build();
    }
}
