package com.taotao.rest.controller;

import com.taotao.rest.dao.DaoConfig;
import com.taotao.rest.dao.IndexDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/29.
 */

@Configuration
@ComponentScan(basePackageClasses = {IndexController.class, DaoConfig.class})
public class ControllerConfiguration {

}
