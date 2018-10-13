package com.hyjf.user;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiasq
 * @version DingdingLogin, v0.1 2018/10/13 14:49
 */
@Controller
public class DingdingLogin {

    /**
     * 后台默认跳转到二维码登录界面
     * @param response
     */
    @RequestMapping(value="login")
    public void toALiDingDing(HttpServletResponse response){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://oapi.dingtalk.com/connect/qrconnect?appid=APPID&")
                .append("response_type=code&scope=snsapi_login&state=")
                .append(System.currentTimeMillis())
                .append("&redirect_uri=")
                .append("REDIRECT_URI");
        try {
            response.sendRedirect(stringBuilder.toString());
        } catch (IOException e1) {
        }
    }
}
