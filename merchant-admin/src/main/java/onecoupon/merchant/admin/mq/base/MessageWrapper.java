package onecoupon.merchant.admin.mq.base;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(force = true)
public final class MessageWrapper<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 消息发送 Keys
     */
    @NonNull
    private String keys;

    /**
     * 消息体
     */
    @NonNull
    private T message;

    /**
     * 消息发送时间
     */
    private Long timestamp = System.currentTimeMillis();
}
