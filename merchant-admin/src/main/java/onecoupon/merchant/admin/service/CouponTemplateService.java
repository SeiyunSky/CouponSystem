package onecoupon.merchant.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import onecoupon.merchant.admin.dao.entity.CouponTemplateDO;
import onecoupon.merchant.admin.dto.req.CouponTemplateNumberReqDTO;
import onecoupon.merchant.admin.dto.req.CouponTemplatePageQueryReqDTO;
import onecoupon.merchant.admin.dto.req.CouponTemplateSaveReqDTO;
import onecoupon.merchant.admin.dto.resp.CouponTemplatePageQueryRespDTO;
import onecoupon.merchant.admin.dto.resp.CouponTemplateQueryRespDTO;

/**
 * 优惠券模板业务逻辑层
 */
public interface CouponTemplateService extends IService<CouponTemplateDO> {

    /**
     * 创建商家优惠券模板
     *
     * @param requestParam 请求参数
     */
    void createCouponTemplate(CouponTemplateSaveReqDTO requestParam);

    /**
     * 查询商家优惠券模板
     * @param requestParam 请求参数
     * @return 商家优惠券模板分页数据
     */
    IPage<CouponTemplatePageQueryRespDTO> pageQueryCouponTemplate(CouponTemplatePageQueryReqDTO requestParam);

    /**
     * 增加优惠券模板发行量
     *
     * @param requestParam 请求参数
     */
    void increaseNumberCouponTemplate(CouponTemplateNumberReqDTO requestParam);

    /**
     * 结束优惠券模板
     *
     * @param couponTemplateId 优惠券模板 ID
     */
    void terminateCouponTemplate(String couponTemplateId);

    /**
     * 根据id查询优惠券模板
     * @param couponTemplateId 优惠券模板 ID
     * @return 查询结果
     */
    CouponTemplateQueryRespDTO findCouponTemplateById(String couponTemplateId);
}
