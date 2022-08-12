package io.lihongbin.controller;

import io.lihongbin.entiy.IpLog;
import io.lihongbin.mapper.IpLogMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WebController {

    private final IpLogMapper ipLogMapper;

    public WebController(IpLogMapper ipLogMapper) {
        this.ipLogMapper = ipLogMapper;
    }

    @GetMapping
    private void ipLog(HttpServletRequest request, String name) {
        ipLogMapper.insert(new IpLog(request.getRemoteAddr(), name));
    }

}
