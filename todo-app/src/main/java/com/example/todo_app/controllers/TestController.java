package com.example.todo_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("first")
    @ResponseBody
    public String first() {
        return "First!";
    }

    @RequestMapping("second")
    @ResponseBody
    public String second() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head><title>Second</title></head>");
        stringBuffer.append("<body>BODY</body>");
        stringBuffer.append("</html>");

        return stringBuffer.toString();
    }

    @RequestMapping("third")
    public String third() {
        return "third";
    }
}
