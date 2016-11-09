package com.bl.blmain.api.controller;

import com.bl.blmain.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by yujingyi on 2016/9/6.
 */
@RequestMapping(value = {"/demo"})
@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = { "/hello" }, method = { GET, POST })
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String singIn(@RequestParam(value = "id", required = true) int id,
                         @RequestParam(value = "name", defaultValue = "") String name,
                         HttpServletRequest request) {

        return "hello world: " + id + " " + " name:" + demoService.getTestData();
    }

}
