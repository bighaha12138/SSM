package com.ssm.controller;
 
import java.util.HashMap;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.ssm.service.IUserService;
import com.ssm.vo.UserVo;
 
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
     
    @RequestMapping("/onSave")
    @ResponseBody
    public Map<String,String> onSave(UserVo userVo){
        Map<String,String> map = new HashMap<String,String>();
        try {
            map = userService.onSave(userVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}