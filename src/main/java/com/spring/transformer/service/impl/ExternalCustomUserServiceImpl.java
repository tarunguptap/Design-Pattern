package com.spring.transformer.service.impl;

import org.springframework.stereotype.Service;

import com.spring.transformer.dto.ExternalUserSearchDTO;
import com.spring.transformer.service.CustomUserService;

@Service("externalCustomUserService")
public class ExternalCustomUserServiceImpl implements CustomUserService<ExternalUserSearchDTO> {

    
    @Override
    public ExternalUserSearchDTO searchUser(Long userId) {
        ExternalUserSearchDTO externalUserSearchDTO = new ExternalUserSearchDTO(1L, "External User", "Password", 
                true, 0, "Admin");
        return externalUserSearchDTO;
    }
     
}
