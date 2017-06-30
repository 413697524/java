package com.taotao.controller;

import com.taotao.common.pojo.TaotaoResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/28.
 */
@Controller
public class SaveVacationController {





    @RequestMapping("saveVacation")
    public void saveVacation(){

//        判断是否陆干 type
        int type = 0;
        if (type == 1){
            return ;
        }
//        获取剩余的假期时间 8
        int leaveVacationDay = 8;

//        获取到请假时间 2017/6/27 08:00 结束 2017/6/27 17:00
        String startTime = "2017/6/27 08:00";
        String endTime = "2017/6/27 17:00";
        int vacationDay = 8;
        String msg= "";
        if (vacationDay > leaveVacationDay){
//            设置需要提示的msg
            msg = "超过限定休假天数";
        }

//        保存请假

        TaotaoResult.ok(msg);










//        return TaotaoResult.ok();

    }






}
