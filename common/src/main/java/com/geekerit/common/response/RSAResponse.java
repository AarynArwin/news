package com.geekerit.common.response;

/**
 * @ClassName RSAResponse
 * @Description RSA生成的公私钥输出参数
 * @Author Aaryn
 * @Date 2018/11/16 16:01
 * @Version 1.0
 */
public class RSAResponse {

    private String serverPublicKey;
    private String serverPrivateKey;

    public static class Builder {
        private String serverPublicKey;
        private String serverPrivateKey;

        public Builder setServerPublicKey(String serverPublicKey) {
            this.serverPublicKey = serverPublicKey;
            return this;
        }

        public Builder setServerPrivateKey(String serverPrivateKey) {
            this.serverPrivateKey = serverPrivateKey;
            return this;
        }

        public RSAResponse build() {
            return new RSAResponse(this);
        }

    }

    public static Builder options() {
        return new Builder();
    }

    public RSAResponse(Builder builder) {
        this.serverPrivateKey = builder.serverPrivateKey;
        this.serverPublicKey = builder.serverPublicKey;
    }

    public String getServerPrivateKey() {
        return serverPrivateKey;
    }

    public String getServerPublicKey() {
        return serverPublicKey;
    }
}
