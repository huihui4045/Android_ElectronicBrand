package com.alizhezi.electronicbrand.bean.home;


import com.alizhezi.electronicbrand.bean.BaseResp;

/**
 * <功能详细描述>
 *
 * @author caoyinfei
 * @version [版本号, 2016/6/6]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class LoginResp extends BaseResp {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
