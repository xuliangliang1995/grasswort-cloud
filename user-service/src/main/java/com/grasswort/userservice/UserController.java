package com.grasswort.userservice;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author xuliangliang
 * @Classname UserController.java
 * @Description
 * @Date 2020/5/11
 * @blame Java Team
 */
@RefreshScope
@RestController
@RequestMapping("users")
public class UserController {

    @Value("${user.id:0}")
    private Long id;
    @Value("${user.name:name}")
    private String name;
    @Value("${user.age:0}")
    private Integer age;
    @Value("${user.sex:女}")
    private String sex;


    @GetMapping("{userId}")
    public User selectOne(@PathVariable("userId") Long userId) {
        if (Objects.equals(id, userId)) {
            User user = new User();
            user.setId(userId);
            user.setName(name);
            user.setAge(age);
            user.setSex(sex);
            return user;
        } else {
            User user = new User();
            user.setId(userId);
            user.setName(RandomStringUtils.randomAlphabetic(6));
            user.setAge(18);
            user.setSex("女");
            return user;
        }

    }
}
