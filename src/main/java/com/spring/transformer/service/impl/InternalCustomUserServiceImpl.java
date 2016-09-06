package com.spring.transformer.service.impl;

import org.springframework.stereotype.Service;

import com.spring.transformer.dto.InternalUserSearchDTO;
import com.spring.transformer.service.CustomUserService;

@Service("internalCustomUserService")
public class InternalCustomUserServiceImpl implements CustomUserService<InternalUserSearchDTO> {

    
    @Override
    public InternalUserSearchDTO searchUser(Long userId) {
        InternalUserSearchDTO internalUserSearchDTO = new InternalUserSearchDTO(2L, "Internal User", "Password", 
                true, 0, "Admin");
        return internalUserSearchDTO;
    }
     
}
