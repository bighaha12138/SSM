package com.ssm.service;
import java.util.Map;
import com.ssm.vo.UserVo;

public interface IUserService {
     
    public Map<String,String> onSave(UserVo userVo);
    
}