package com.yoyo.api;

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

    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Spring测试案例").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.yoyo.handler")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Spring 中使用Swagger2构建文档").termsOfServiceUrl("https://blog.52itstyle.com")
                .contact(new Contact("科帮网 ", "https://blog.52itstyle.com/", "345849402@qq.com")).version("1.1").build();
    }
}
