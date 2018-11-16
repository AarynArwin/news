//package com.geekerit.common.service.impl;
//
//import com.geekerit.common.request.KeyRequest;
//import com.geekerit.common.response.KeyResponse;
//import com.geekerit.common.response.RSAResponse;
//import com.geekerit.common.service.EncryptOpenService;
//
///**
// * @ClassName EncryptOpenServiceImpl
// * @Description TODO
// * @Author Aaryn
// * @Date 2018/11/16 16:05
// * @Version 1.0
// */
//public class EncryptOpenServiceImpl implements EncryptOpenService {
//
//    @Value("${rsa.publicKey}")
//    private String publicKey;
//    @Value("${rsa.privateKey}")
//    private String privateKey;
//    @Value("${api.encrypt.key}")
//    private String key;
//
//    @Override
//    public SingleResult<RSAResponse> getRSA() {
//        RSAResponse response = RSAResponse.options()
//                .setServerPublicKey(publicKey)
//                .build();
//        return SingleResult.buildSuccess(response);
//    }
//
//    @Override
//    public SingleResult<KeyResponse> getKey(KeyRequest request) throws Exception {
//        String clientPublicKey = RSAUtils.privateDecrypt(request.getClientEncryptPublicKey(), RSAUtils.getPrivateKey(privateKey));
//        String encryptKey = RSAUtils.publicEncrypt(key, RSAUtils.getPublicKey(clientPublicKey));
//        KeyResponse response = KeyResponse.options()
//                .setKey(encryptKey)
//                .build();
//        return SingleResult.buildSuccess(response);
//    }
//}
