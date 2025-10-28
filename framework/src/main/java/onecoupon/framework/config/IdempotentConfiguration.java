package onecoupon.framework.config;

import onecoupon.framework.idempotent.NoDuplicateSubmitAspect;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 幂等组件相关配置类
 */
@Configuration
public class IdempotentConfiguration {

    @Bean
    public NoDuplicateSubmitAspect noDuplicateSubmitAspect(RedissonClient redissonClient){
        return new NoDuplicateSubmitAspect(redissonClient);
    }
}
