/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.constants;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝服务窗获取*/
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id
    public static final String APP_ID            = "2016080500174784";

    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDhlWg5ALjlrf1s/9a0uvMG1WU/7aKwb1LC1Y2yC+1K8Hwbp8DQ5ltMsPShKp7HkqV4h8b+z5r/krhaiULTXE+BjiLTBQsciE56DqyrLqCnRuOC4eZM3oXFv5xTxoczmVfJN9YanUXSq/bVFP6neX1qD8DVeDI/6BgYyM2y9r3Vu2GgB5CkhaAfj+2w8DzSbXH7rOW6/oRCQ2ycNZUZmXIPTPzevYtj0XnJmNP4aLbZmlsJ1UD2TgWtqTL6y/ImTzmup8Z8+InVUyHRlAN+Ly2bCB3PgyHKgpzhtGFfyEq/cmhVoGEYvkYhX2A+qTg6Q936/E6DIX3GOducbOLIoJlfAgMBAAECggEBANDyszcZlCoqnzL3Rsjg4XrS7pXoZ2lFtEMDy9u/cGyZlFuJZvAYbzj6L52Y/Lme++ZI3enoIonYPSqfOWbNeldmcJtFcKVdHFOyg/2LkwNehh4VYFyTQRWKBiMTIOiKgOXA8nB0fNhGsLtuVvKJdcFoFhWk3+aR9MAAP4glRHFTAilVqy+BfwVEia/NGicd7t6TZbQfXrkadCWOFKra0ecqm1MZ7RY8L2nS/fMk/MPRNZvkHlqEW5UBamdeTDmf/OOU8ospnkKboeecjip6qw/7pNLMqcH98u0/XSOMBX18lnC812Oj2G2m4aMxRr7OPotZi0v8pV4VFzhoywTelAECgYEA9jU9hstK+T8BueDsg/HRTLoB+f5mV3TSj99/1d82zDDCh9fGdeE2oSBvK8EKD2TY35B1aHZ5e3yiJrlMl5c/zWNV6qZshdh1piE4j7fQq8SGphLHd+7PjZMLHdN4/rUE5OnHBqwfqmf0yypFihDg2rBtpqfXCUU/NHiCo26gOg8CgYEA6o4uOD/fXU0KSxK3+SnJQtNE4XLj7/jJ35Iw+wpprdKuEssXvbl9idMfO7DP8elLKLHPVq7qlBIi/CjmX3N6nP7/civ8himxvYfg9fjNnXUttgXv51VkS7e1xTkBzDP7zS7FNh7ok9LKMoYSiJPon9wzmpuyKIybsXl5JR0ZO7ECgYBuG39Jkg8Uiq397+42T+X3d1Q89h3UzOUB/MUR48KA7OmCkOgrfa3Nv1CYc7tJCSPIT7WCI0HPDP0DbmknfjfFZcBdsVHlRdnPkxnVhDIpLzm8ebeFFmLyAKm/C/0Xg+MNcNNWU5HRxq3+UghJZ6T3iGFxX6xWdAaBM8fQyT+U1wKBgHZOgMGedet5kFeNeX4TtZAfP/73FEFWG3zJICt/dQ5X1bVk+vSXOtrpwjc5V6mNInvEM/BlCazl+P93IbvDY3UMqYvM4/JH1X7jqnRmqk9ha00EcZ0dVRlb8DMqLd3x2nADxzUlIeptx870ESUSdaMsTlsNbS9GvMEnpBM0OiYBAoGBAOL1nAwSTCYF45y4ztecpIQvcA3XDF283xUWG6CBokf8l+9xhXeTDELc81j3KN9lutmrb25NGZn9WoqkiDb1CNogx5HMrGQf7wWg6H5UotWNEPIhjDGJl6OkCxDQbDfmlQu6IbXX5Jo/fk0+wSJU5wZ5Lb/l8kdCnzggM4k0Cd2M";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsqgZ/Jw41gRznqgSqR3Vqh2zdEY/ZugKuuyLob8+qI1QBMZDx4NpATQe0j9xqW8Sl/AZE84Dmkicl7TRN3MJGNpwfC/6hLr8k1aKRJ3OKmpbs1oTcSSTJFYxPkJwvfpw32DddhhqDHGkwAeO0I1yCqM3fBWgxka61wMP8Aps54ENvYPjpFgq9x+/wrJ1zCSJiAnveAVO+yoHHH750tjA9OTsKkNt0Z9abj3N50acblwz+FlGDum6ijq1L5t3TUBoVtUaSC3n6/Kh3gL0eITyZEFl3ObL9mhwmTdysFZuS+MaEDk1rkEpyn66rZBT9vN2Er43OdQgsmq9Hoom2e6OLQIDAQAB";
    //MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsqgZ/Jw41gRznqgSqR3Vqh2zdEY/ZugKuuyLob8+qI1QBMZDx4NpATQe0j9xqW8Sl/AZE84Dmkicl7TRN3MJGNpwfC/6hLr8k1aKRJ3OKmpbs1oTcSSTJFYxPkJwvfpw32DddhhqDHGkwAeO0I1yCqM3fBWgxka61wMP8Aps54ENvYPjpFgq9x+/wrJ1zCSJiAnveAVO+yoHHH750tjA9OTsKkNt0Z9abj3N50acblwz+FlGDum6ijq1L5t3TUBoVtUaSC3n6/Kh3gL0eITyZEFl3ObL9mhwmTdysFZuS+MaEDk1rkEpyn66rZBT9vN2Er43OdQgsmq9Hoom2e6OLQIDAQAB
    
     public static final String PUBLIC_KEY2     = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2qg7oHwVNhA4u6J5y0suLsKDpZ3CsJHhGhyabwdXzgy0yAngFJMC5bBmsfA5gl+CB1HOhaplT2BqxnxpgArUNDqI63c7Cj9ruak1x2UktAydtVg8+O3/gdln0sArZ8JXmrKzGUIB9xGYCZB53iYY4k4JzEbv8ei/2r+BZpkImvRMCGIiN2JpHOp1r2mwGJiA9w5XBIPqVNmtyx3/unnN5BCFBFkMQAj4OvaMlgHEtr/lD0X53dRW+AKdaIV3nKOKI1lLxssetfPB4yM+Jg8bsq9W14xaRDB/g0QB++ULjlymIgoAw5Ck0RoosRS9brtTTC1FC4t8ukf5yFt1a9MMPQIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "http://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
