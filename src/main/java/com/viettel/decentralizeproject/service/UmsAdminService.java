package com.viettel.decentralizeproject.service;

import com.viettel.decentralizeproject.common.api.CommonResponse;
import com.viettel.decentralizeproject.common.api.Message;
import com.viettel.decentralizeproject.dto.UmsAdminParam;
import com.viettel.decentralizeproject.models.UmsAdmin;
import com.viettel.decentralizeproject.repositories.UmsAdminRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UmsAdminService {
    private final UmsAdminRepo umsAdminRepo;

    public CommonResponse getAdminByUserName(String username) {
       try {
           Optional<UmsAdmin> adminOp = umsAdminRepo.findByUsername(username);
           if(adminOp.isPresent()){
               UmsAdmin admin = adminOp.get();
               return CommonResponse.success(admin);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
       return null;
    }


    public CommonResponse<UmsAdmin> register(UmsAdminParam umsAdminParam){
        CommonResponse<UmsAdmin> response = new CommonResponse<>();
        try{
//            response.message()
        }catch (Exception e){

        }
        return new CommonResponse<>();
    }

}
