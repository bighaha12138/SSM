package com.ssm.service.impl;
 
import java.util.HashMap;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import com.ssm.vo.UserVo;
 
@Service
public class UserServiceImpl implements IUserService{
     
    @Autowired
    private UserMapper userMapper;
     
    @Override
    public Map<String, String> onSave(UserVo userVo) {
        Map<String, String> map = new HashMap<String,String>();
        try {
            User user = new User();
            user.setName(userVo.getName());
            user.setSex(userVo.getSex());
            int i = userMapper.insert(user);
            if(i > 0){
                map.put("status", "Y");
                map.put("message", "新增成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
     
}