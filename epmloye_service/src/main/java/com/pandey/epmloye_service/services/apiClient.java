package com.pandey.epmloye_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pandey.epmloye_service.dto.departmentDto;

@FeignClient(name ="DEPARTMENT-SERVICE")//first we wrote this to configure but after registering with the eureka server we changed it url = "http://localhost:8080/",value = "DEPARTMENT-SERVICE"
public interface apiClient {
    @GetMapping("api/department/{dept-code}")
    departmentDto getByCode(@PathVariable("dept-code") String code);

}
