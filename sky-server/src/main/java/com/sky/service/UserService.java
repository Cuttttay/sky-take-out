package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.vo.UserLoginVO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * 微信登录功能
     * @param userLoginDTO
     * @return
     */
    User wxLongin(UserLoginDTO userLoginDTO);
}
