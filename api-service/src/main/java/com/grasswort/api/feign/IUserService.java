package com.grasswort.api.feign;

import com.grasswort.api.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuliangliang
 * @Classname IUserService.java
 * @Description
 * @Date 2020/5/16
 * @blame Java Team
 */
@FeignClient("user-service")
public interface IUserService {

    @GetMapping("/users/{userId}")
    User selectOne(@PathVariable("userId") Long userId);
}
