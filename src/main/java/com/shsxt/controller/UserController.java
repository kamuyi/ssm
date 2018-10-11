/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   Yuan
 * Date:     2018/10/11 20:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.shsxt.controller;


import com.shsxt.po.User;
import com.shsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *
 *
 * @author Yuan
 * @create 2018/10/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("queryById")
    public User queryById(Integer id) throws Exception {
        return userService.queryById(id);
    }
}
