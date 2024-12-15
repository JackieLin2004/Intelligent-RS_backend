package ynu.intelligentrs.intelligentrs_backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "${api.title: Intelligent-RS}",
                version = "${api.version: v1}",
                description = "${api.description: 这里是Intelligent-RS的后端项目}",
                contact = @Contact(name = "JackieLin", url = "https://github.com/JackieLin2004"),
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0")
        )
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SpringDocConfiguration {
    @Bean
    public GroupedOpenApi publicApi() {
        String[] publicPaths = {"/api/auth/**", "/doc/**", "/captcha/**"};
        return GroupedOpenApi.builder().group("可匿名调用的API接口")
                .pathsToMatch(publicPaths)
                .build();
    }

    @Bean
    public GroupedOpenApi protectedApi() {
        return GroupedOpenApi.builder().group("需认证后才可调用的API接口")
                .pathsToMatch("/api/**")
                .build();
    }
}