package onecoupon.framework.config;

import onecoupon.framework.web.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;

/**
 * Web 组件自动装配
 */
public class WebAutoConfiguration {

    /**
     * 构建全局异常拦截器组件 Bean
     */
    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}
