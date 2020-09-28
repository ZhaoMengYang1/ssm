package com.zz.ssm.handler;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class ErrorPageInterceptor extends HandlerInterceptorAdapter {

    private List<Integer> errorCodeList = Arrays.asList(404, 403, 500, 501);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
            Exception {
        if (errorCodeList.contains(response.getStatus())) {
            response.sendRedirect("/webupload/layWebuploadDemo.html");
            return false;
        }
        return super.preHandle(request, response, handler);
    }


}
