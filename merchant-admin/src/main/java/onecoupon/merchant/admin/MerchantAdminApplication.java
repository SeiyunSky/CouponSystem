package onecoupon.merchant.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import com.mzt.logapi.starter.annotation.EnableLogRecord;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 商家后管服务｜创建优惠券、店家查看以及管理优惠券、创建优惠券发放批次等
 */
@SpringBootApplication
@MapperScan("onecoupon.merchant.admin.dao.mapper")
@EnableLogRecord(tenant = "MerchantAdmin")
public class MerchantAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantAdminApplication.class, args);
    }
}
