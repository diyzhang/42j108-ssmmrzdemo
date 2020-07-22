package cn.toj.zkssmmrconsumer.controller;

import cn.toj.zkssmmrconsumer.dto.LoginInformationDto;
import cn.toj.zkssmmrconsumer.dto.UserDto;
import cn.toj.zkssmmrconsumer.reposity.ZkConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/21
 */

@RestController
public class ZkConsumerController {

    @Autowired
    private ZkConsumerClient client;

    @PostMapping("/getLoginInfo")
    public Map<String, UserDto> getInfo(@RequestBody LoginInformationDto info) {
        Map<String, UserDto> userMap = client.getLoginInfo(info);
        return userMap;
    }

}
