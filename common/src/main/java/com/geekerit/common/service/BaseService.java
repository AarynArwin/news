//package com.geekerit.common.service;
//
///**
// * @ClassName BaseService
// * @Description TODO
// * @Author Aaryn
// * @Date 2018/11/16 15:49
// * @Version 1.0
// */
//public abstract class BaseService {
//    /**
//     * 密码加密算法
//     * @param password
//     * @return
//     */
//    protected String encryptPassword(String password){
//        return MessageDigestUtils.encrypt(password, Algorithm.SHA1);
//    }
//
//    /**
//     * 生成API鉴权的Token
//     * @param mobile
//     * @param password
//     * @return
//     */
//    protected String getToken(String mobile,String password){
//        return MessageDigestUtils.encrypt(mobile+password, Algorithm.SHA1);
//    }
//}
