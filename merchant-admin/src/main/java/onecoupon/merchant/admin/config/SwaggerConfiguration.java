package onecoupon.merchant.admin.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 设置文档 API Swagger 配置信息，为了让 <a href="http://127.0.0.1:{server.port}{server.servlet.context-path}/doc.html" /> 中的信息看着更饱满
 */
@Slf4j
@Configuration
public class SwaggerConfiguration implements ApplicationRunner {

    @Value("${server.port:8080}")
    private String serverPort;
    @Value("${server.servlet.context-path:}")
    private String contextPath;

    /**
     * 自定义 openAPI 个性化信息
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info() // 基本信息配置
                        .title("沫路优惠券-商家后台管理系统") // 标题
                        .description("创建优惠券、店家查看以及管理优惠券、创建优惠券发放批次等") // 描述 Api 接口文档的基本信息
                        .version("v1.0.0") // 版本
                        // 设置 OpenAPI 文档的联系信息
                        .contact(new Contact().name("molu").email("1447909240@QQ.com"))
                        // 设置 OpenAPI 文档的许可证信息，包括许可证名称和许可证URL
                        .license(new License().name("沫路制作").url("https://github.com/SeiyunSky?tab=repositories"))
                );
    }

    /**
     * 方便启动项目后可以直接点击链接跳转，而不用自己到浏览器输入路径
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("API Document: http://127.0.0.1:{}{}/doc.html", serverPort, contextPath);
    }
}
