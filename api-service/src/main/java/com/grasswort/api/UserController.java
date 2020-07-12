package com.grasswort.api;

import com.grasswort.api.dto.User;
import com.grasswort.api.feign.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuliangliang
 * @Classname UserController.java
 * @Description
 * @Date 2020/5/16
 * @blame Java Team
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("{userId}")
    public User selectOne(@PathVariable("userId") Long userId) {
        return userService.selectOne(userId);
    }
}
