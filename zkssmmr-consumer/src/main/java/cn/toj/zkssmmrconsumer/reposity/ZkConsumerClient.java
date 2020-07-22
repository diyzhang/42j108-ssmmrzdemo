package cn.toj.zkssmmrconsumer.reposity;

import cn.toj.zkssmmrconsumer.dto.LoginInformationDto;
import cn.toj.zkssmmrconsumer.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient("zkssmmr-producer")
public interface ZkConsumerClient {

    @PostMapping("/login")
    Map<String, UserDto> getLoginInfo(@RequestBody LoginInformationDto loginInformationDto);

}
