/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserService
 * Author:   Yuan
 * Date:     2018/10/11 20:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.shsxt.service;


import com.shsxt.base.BaseService;
import com.shsxt.dao.UserMapper;
import com.shsxt.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 *
 * @author Yuan
 * @create 2018/10/11
 * @since 1.0.0
 */
@Service
public class UserService extends BaseService<User>{

    @Autowired
    private UserMapper userMapper;
}
