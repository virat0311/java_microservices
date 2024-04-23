package com.pandey.epmloye_service.services.impl;
import com.pandey.epmloye_service.dto.apiResponseDto;
import com.pandey.epmloye_service.dto.departmentDto;
import com.pandey.epmloye_service.dto.employeeDto;
import com.pandey.epmloye_service.entity.employee;
import com.pandey.epmloye_service.repository.employeeRepository;

import com.pandey.epmloye_service.services.employeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import com.pandey.epmloye_service.services.apiClient;

@Service
@AllArgsConstructor
public class employeeServiceImpl implements employeeService {
    private employeeRepository employeeRepository;
    //1private RestTemplate restTemplate;
    //2private WebClient webClient;
    private apiClient apiClient;




    @Override
    public employeeDto saveEmployee(employeeDto employeedto) {
        employee e=new employee(employeedto.getId(),employeedto.getFirstName(),employeedto.getLastName(),employeedto.getEmail(),employeedto.getDepartmentCode());
        employee res=employeeRepository.save(e);
        employeeDto edto=new employeeDto(res.getId(),res.getFirstName(),res.getLastName(),res.getEmail(),res.getDepartmentCode());
        return edto;
    }

    @Override
    public apiResponseDto getEmployeeById(Long id) {
        //employee e=new employee(employeedto.getId(), employeedto.getFirstName(),employeedto.getLastName(),employeedto.getEmail());
        employee e=employeeRepository.findById(id).get();
        // resttemplate method to call microservice from emp to dept and then 2webclient method implementation
// 1       ResponseEntity<departmentDto> responseEntity=restTemplate.getForEntity("http://localhost:8080/api/department/"+e.getDepartmentCode(), departmentDto.class);
//        departmentDto departDto=responseEntity.getBody();
// 2     departmentDto departDto= webClient.get().uri("http://localhost:8080/api/department/"+e.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(departmentDto.class)
//                .block();
        departmentDto departDto= apiClient.getByCode(e.getDepartmentCode());
        employeeDto es=new employeeDto(e.getId(),e.getFirstName(),e.getLastName(),e.getEmail(),e.getDepartmentCode());
        apiResponseDto api=new apiResponseDto();
        api.setEmployeeDto(es);
        api.setDepartmentDto(departDto);
        return api;
    }
}
