package com.geekerit.common.request;

import com.sun.istack.internal.NotNull;
import lombok.Data;

/**
 * @ClassName KeyRequest
 * @Description 请求公钥
 * @Author Aaryn
 * @Date 2018/11/16 15:59
 * @Version 1.0
 */
@Data
public class KeyRequest {

    /**
     * 客户端自己生成的加密后公钥
     */
    @NotNull
    private String clientEncryptPublicKey;
}
