package com.user.user.contorller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Dongwy
 * @version v3.0
 * @date 2021-08-19 11:31
 */
@RestController
@Slf4j
@RequestMapping("/api/user")
@Api(value = "用户管理", tags = "用户管理接口")
public class UserContorller {

    @GetMapping("/createUser")
    @ApiOperation(value = "创建用户")
    public String createUser(@RequestParam(required = false) Map<String, Object> userInfo){
        return "dongwy";
    }
}
