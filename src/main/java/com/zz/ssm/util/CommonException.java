package com.zz.ssm.util;

import com.zz.ssm.entity.ResultCode;

/**
 * @Author:zhaomengyang
 * @Date:2020/9/27
 */
public class CommonException extends Exception {

    private ResultCode resultCode;


    public ResultCode getResultCode() {
        return resultCode;
    }


    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }


    public CommonException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }



}
