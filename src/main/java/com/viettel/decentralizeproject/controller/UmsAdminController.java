package com.viettel.decentralizeproject.controller;

import com.viettel.decentralizeproject.common.api.CommonResponse;
import com.viettel.decentralizeproject.models.UmsAdmin;
import com.viettel.decentralizeproject.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UmsAdminController {
    @Autowired
    private  UmsAdminService umsAdminService;

    @GetMapping("/find-by-username")

    public ResponseEntity<CommonResponse> getByUsername(@RequestParam String username){
        CommonResponse response = umsAdminService.getAdminByUserName(username);
        return  new ResponseEntity<>(response, HttpStatus.valueOf(response.getMessage().getStatus()));
    }
}
