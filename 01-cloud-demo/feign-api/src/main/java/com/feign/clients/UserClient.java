package com.feign.clients;

import com.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zwc
 * 2022-07-28
 * 9:34
 */

@FeignClient("userservice")
public interface UserClient {

        @GetMapping("/user/{id}")
        User findById(@PathVariable("id") Long id);
}
