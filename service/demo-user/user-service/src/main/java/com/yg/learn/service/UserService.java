package com.yg.learn.service;



import com.yg.learn.api.dto.e.UserEnterDTO;
import com.yg.learn.api.dto.o.HomePage2DTO;
import com.yg.learn.api.dto.o.HomePageDTO;
import com.yg.learn.api.dto.o.UserOutDTO;



public interface UserService {

    UserOutDTO getDataSourceUser(Long id);

    UserOutDTO insertData(UserEnterDTO userEnterDTO);

    HomePageDTO gethomePage();

    HomePage2DTO gethomePage2();

    void updateUser(Long id);
}
