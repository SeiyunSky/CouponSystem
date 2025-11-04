package onecoupon.merchant.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import onecoupon.merchant.admin.dao.entity.CouponTaskDO;
import onecoupon.merchant.admin.dto.req.CouponTaskCreateReqDTO;

public interface CouponTaskService extends IService<CouponTaskDO> {

    /**
     * 商家创建优惠券推送任务
     *
     * @param requestParam 请求参数
     */
    void createCouponTask(CouponTaskCreateReqDTO requestParam);
}
