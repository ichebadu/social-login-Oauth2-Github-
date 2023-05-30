package com.login.social.login;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info= @Info(
				title = "Spring Boot Social login Rest APIs",
				description = "Spring Boot Social login Rest APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "ichebadu chukwu",
						email = "chukwu.iche@gmail.com",
						url = "https://www.ichejazz.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ichejazz.net/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "spring Boot Social Login Documentation",
				url = "https://github.com/ichebadu/social-login"
		)

)
//@SecurityScheme(
//		name= "bearAuth",
//		description = "JWT auth description",
//		scheme = "bearer",
//		type = SecuritySchemeType.HTTP,
//		bearerFormat = "JWT",
//		in = SecuritySchemeIn.HEADER
//)
public class SocialLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialLoginApplication.class, args);
	}

}
